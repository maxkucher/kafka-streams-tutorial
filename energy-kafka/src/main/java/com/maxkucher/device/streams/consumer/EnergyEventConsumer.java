package com.maxkucher.device.streams.consumer;

import com.maxkucher.device.common.dao.DeviceDAO;
import com.maxkucher.device.streams.configuration.StreamsConfiguration;
import com.maxkucher.energyresources.BatteryEvent;
import io.confluent.kafka.streams.serdes.avro.SpecificAvroSerde;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.Consumed;
import org.apache.kafka.streams.kstream.KStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;

public class EnergyEventConsumer implements Runnable {

    private static final Logger LOGGER = LoggerFactory.getLogger(EnergyEventConsumer.class.getName());
    private final StreamsConfiguration streamsConfiguration;
    private final DeviceDAO deviceDAO;

    public EnergyEventConsumer(StreamsConfiguration streamsConfiguration, DeviceDAO deviceDAO) {
        this.streamsConfiguration = streamsConfiguration;
        this.deviceDAO = deviceDAO;
    }


    @Override
    public void run() {
        Properties props = new Properties();
        props.put(StreamsConfig.APPLICATION_ID_CONFIG, streamsConfiguration.getAppId());
        props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, streamsConfiguration.getBootstrapServers());
        final Map<String, String> serdeConfig = Collections.singletonMap("schema.registry.url",
                streamsConfiguration.getSchemaRegistryUrl());
        final Serde<BatteryEvent> valueSerDe = new SpecificAvroSerde<>();
        valueSerDe.configure(serdeConfig, false);
        StreamsBuilder streamsBuilder = new StreamsBuilder();
        KStream<String, BatteryEvent> chargingEventKStream = streamsBuilder
                .stream(streamsConfiguration.getChargingEventsTopicName(), Consumed.with(Serdes.String(), valueSerDe));
        chargingEventKStream
                .map((key, value) -> new KeyValue<>(key, value.getCharging()))
                .foreach((key, event) -> {
                    LOGGER.info("Event received. key: {}, value {}", key, event);
                    deviceDAO.setDeviceState(UUID.fromString(key), event);
                });
        LOGGER.info("Starting stream consumer...");
        KafkaStreams streams = new KafkaStreams(streamsBuilder.build(), props);
        streams.setUncaughtExceptionHandler((t, e) -> LOGGER.error("Kafka streams uncaught exception {}", e.getMessage()));
        streams.start();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            LOGGER.info("Closing kafka streams");
            streams.close();
        }));
    }
}
