import com.maxkucher.energyresources.BatteryEvent;
import configuration.ApplicationConfiguration;
import controllers.EventsProducerController;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import services.EventsProducer;
import services.KafkaEventsProducer;

import java.util.Properties;

public class EventsApplication extends Application<ApplicationConfiguration> {


    public static void main(String[] args) throws Exception {
        new EventsApplication().run("server", "scaffold/configuration.yaml");
    }

    @Override
    public void run(ApplicationConfiguration applicationConfiguration, Environment environment) {
        Producer<String, BatteryEvent> producer = getKafkaProducer(applicationConfiguration);
        EventsProducer eventsProducer = new KafkaEventsProducer(producer, applicationConfiguration);
        environment.jersey().register(new EventsProducerController(eventsProducer));
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
}
