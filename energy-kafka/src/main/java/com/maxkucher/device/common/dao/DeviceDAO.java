package com.maxkucher.device.common.dao;

import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.UUID;

public interface DeviceDAO {

    @SqlQuery("select state from devices where id = :id")
    Integer getDeviceState(@Bind("id") UUID deviceId);

    @SqlUpdate("insert into devices (id, state) values (:id, :state) on conflict (id) do update set state = :state")
    void setDeviceState(@Bind("id") UUID deviceId, @Bind("state") int deviceState);
}
