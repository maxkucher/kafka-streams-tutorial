package com.maxkucher.device.api;

import com.maxkucher.device.common.Constants;
import com.maxkucher.device.api.services.EventsProducer;
import com.maxkucher.device.api.controllers.DeviceResource;
import com.maxkucher.device.api.services.KafkaEventsProducer;
import com.maxkucher.device.common.dao.DeviceDAO;
import com.maxkucher.device.common.dao.DeviceDAOProvider;
import com.maxkucher.energyresources.BatteryEvent;
import com.maxkucher.device.api.configuration.ApplicationConfiguration;
import io.dropwizard.Application;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.setup.Environment;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;

import java.util.Properties;

public class ApiApplication extends Application<ApplicationConfiguration> {


    public static void main(String[] args) throws Exception {
        new ApiApplication().run("server", "scaffold/api-configuration.yaml");
    }

    @Override
    public void run(ApplicationConfiguration applicationConfiguration, Environment environment) {
        DeviceDAO deviceDAO = getDeviceDao(applicationConfiguration.getDatabase(),
                environment);
        Producer<String, BatteryEvent> producer = getKafkaProducer(applicationConfiguration);
        EventsProducer eventsProducer = new KafkaEventsProducer(producer, applicationConfiguration);
        environment.jersey().register(new DeviceResource(eventsProducer, deviceDAO));
    }

    public Producer<String, BatteryEvent> getKafkaProducer(ApplicationConfiguration applicationConfiguration) {
        Properties properties = new Properties();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, applicationConfiguration.getBootstrapServers());
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, applicationConfiguration.getKeySerializer());
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, applicationConfiguration.getValueSerializer());
        properties.put(Constants.SCHEMA_REGISTRY_URL_KAFKA_CONFIGURATION_PROPERTY,
                applicationConfiguration.getSchemaRegistryUrl());
        return new KafkaProducer<>(properties);
    }


    public DeviceDAO getDeviceDao(DataSourceFactory dataSourceFactory, Environment environment){
        final DeviceDAOProvider deviceDAOProvider = new DeviceDAOProvider();
        return deviceDAOProvider.getDeviceDao(dataSourceFactory, environment);
    }
}
