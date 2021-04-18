package com.maxkucher.device.common.dao;

import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.jdbi3.JdbiFactory;
import io.dropwizard.setup.Environment;
import org.jdbi.v3.core.Jdbi;

public class DeviceDAOProvider {
    public DeviceDAO getDeviceDao(DataSourceFactory dataSourceFactory, Environment environment){
        final JdbiFactory factory = new JdbiFactory();
        final Jdbi jdbi = factory.build(environment, dataSourceFactory, "postgresql");
        return jdbi.onDemand(DeviceDAO.class);
    }
}
