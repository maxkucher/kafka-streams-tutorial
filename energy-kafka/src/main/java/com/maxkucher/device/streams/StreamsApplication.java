package com.maxkucher.device.streams;

import com.maxkucher.device.api.ApiApplication;
import com.maxkucher.device.common.dao.DeviceDAO;
import com.maxkucher.device.common.dao.DeviceDAOProvider;
import com.maxkucher.device.streams.configuration.StreamsConfiguration;
import com.maxkucher.device.streams.consumer.EnergyEventConsumer;
import io.dropwizard.Application;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.setup.Environment;

import java.util.concurrent.ExecutorService;

public class StreamsApplication extends Application<StreamsConfiguration> {

    public static void main(String[] args) throws Exception {
        new StreamsApplication().run("server", "scaffold/streams-configuration.yaml");
    }

    @Override
    public void run(StreamsConfiguration streamsConfiguration, Environment environment) {
        final DeviceDAO deviceDAO = getDeviceDao(streamsConfiguration.getDatabase(),
                environment);
        final ExecutorService executorService = environment.lifecycle().executorService("streams-app").build();
        final EnergyEventConsumer energyEventConsumer = new EnergyEventConsumer(streamsConfiguration, deviceDAO);
        executorService.submit(energyEventConsumer);
    }

    public DeviceDAO getDeviceDao(DataSourceFactory dataSourceFactory, Environment environment){
        final DeviceDAOProvider deviceDAOProvider = new DeviceDAOProvider();
        return deviceDAOProvider.getDeviceDao(dataSourceFactory, environment);
    }
}
