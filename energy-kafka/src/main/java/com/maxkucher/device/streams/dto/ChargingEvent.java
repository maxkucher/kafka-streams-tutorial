package com.maxkucher.device.streams.dto;

public class ChargingEvent {
    private String deviceId;
    private int charging;

    public ChargingEvent(String deviceId, int charging) {
        this.deviceId = deviceId;
        this.charging = charging;
    }

    public int getCharging() {
        return charging;
    }

    public String getDeviceId() {
        return deviceId;
    }

    @Override
    public String toString() {
        return "ChargingEvent{" +
                "deviceId='" + deviceId + '\'' +
                ", charging=" + charging +
                '}';
    }
}
