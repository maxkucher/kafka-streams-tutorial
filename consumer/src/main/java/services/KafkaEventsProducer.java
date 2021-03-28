package services;

import com.maxkucher.energyresources.BatteryEvent;
import com.maxkucher.energyresources.ChargingSource;
import configuration.ApplicationConfiguration;
import dto.EventDTO;
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
    public void sendEvent(EventDTO eventDTO) throws IOException {
        BatteryEvent batteryEvent = new BatteryEvent(
                eventDTO.getDeviceId().toString(),
                eventDTO.getRegion() != null ? eventDTO.getRegion().toString() : null,
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
