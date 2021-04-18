package com.maxkucher.device.api.services;

import com.maxkucher.device.api.dto.EventDTO;
import com.maxkucher.energyresources.BatteryEvent;
import com.maxkucher.energyresources.ChargingSource;
import com.maxkucher.device.api.configuration.ApplicationConfiguration;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.io.IOException;

public class KafkaEventsProducer implements EventsProducer {
    private final Producer<String, BatteryEvent> producer;
    private final ApplicationConfiguration applicationConfiguration;

    public KafkaEventsProducer(Producer<String, BatteryEvent> producer, ApplicationConfiguration applicationConfiguration) {
        this.producer = producer;
        this.applicationConfiguration = applicationConfiguration;
    }

    @Override
    public void sendEvent(EventDTO eventDTO) {
        BatteryEvent batteryEvent = new BatteryEvent(
                eventDTO.getDeviceId().toString(),
                eventDTO.getRegion() != null ? eventDTO.getRegion().toString() : "",
                (int) eventDTO.getCharging(),
                ChargingSource.valueOf(eventDTO.getChargingSource().getType()),
                (int) eventDTO.getModuleLTemperature(),
                (int) eventDTO.getModuleRTemperature(),
                (int) eventDTO.getProcessor1Temp(),
                (int) eventDTO.getProcessor2Temp(),
                (int) eventDTO.getProcessor3Temp(),
                (int) eventDTO.getProcessor4Temp(),
                (int) eventDTO.getInverterState(),
                eventDTO.getSoCRegulator()
        );
        producer.send(new ProducerRecord<>(applicationConfiguration.getChargingEventsTopicName(),
                batteryEvent.getDeviceId().toString(), batteryEvent));
    }
}
