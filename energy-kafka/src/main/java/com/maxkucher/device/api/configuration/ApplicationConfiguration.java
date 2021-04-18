package com.maxkucher.device.api.configuration;

import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class ApplicationConfiguration extends Configuration {

    @Valid
    @NotNull
    private DataSourceFactory database = new DataSourceFactory();
    private String bootstrapServers;
    private int retries;
    private int lingerMilliseconds;
    private String keySerializer;
    private String valueSerializer;
    private String schemaRegistryUrl;
    private String chargingEventsTopicName;

    public String getBootstrapServers() {
        return bootstrapServers;
    }

    public int getRetries() {
        return retries;
    }

    public int getLingerMilliseconds() {
        return lingerMilliseconds;
    }

    public String getKeySerializer() {
        return keySerializer;
    }

    public String getValueSerializer() {
        return valueSerializer;
    }

    public String getSchemaRegistryUrl() {
        return schemaRegistryUrl;
    }

    public String getChargingEventsTopicName() {
        return chargingEventsTopicName;
    }

    public DataSourceFactory getDatabase() {
        return database;
    }
}
