package com.maxkucher.device.streams.configuration;

import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class StreamsConfiguration extends Configuration {

    @Valid
    @NotNull
    private DataSourceFactory database = new DataSourceFactory();

    private String bootstrapServers;
    private String schemaRegistryUrl;
    private String chargingEventsTopicName;
    private String appId;
    private String consumerGroupName;

    public String getBootstrapServers() {
        return bootstrapServers;
    }

    public String getSchemaRegistryUrl() {
        return schemaRegistryUrl;
    }

    public String getChargingEventsTopicName() {
        return chargingEventsTopicName;
    }

    public String getAppId() {
        return appId;
    }

    public String getConsumerGroupName() {
        return consumerGroupName;
    }

    public DataSourceFactory getDatabase() {
        return database;
    }
}
