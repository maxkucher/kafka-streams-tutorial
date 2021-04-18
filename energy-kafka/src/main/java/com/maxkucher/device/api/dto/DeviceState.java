package com.maxkucher.device.api.dto;

import java.util.UUID;

public class DeviceState {
    private UUID deviceId;
    private Integer deviceState;

    public DeviceState(UUID deviceId, Integer deviceState) {
        this.deviceId = deviceId;
        this.deviceState = deviceState;
    }

    public DeviceState() {
    }

    public UUID getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(UUID deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getDeviceState() {
        return deviceState;
    }

    public void setDeviceState(Integer deviceState) {
        this.deviceState = deviceState;
    }
}
