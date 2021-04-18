package com.maxkucher.device.api.dto;

public enum ChargingSource {

    SOLAR("solar"),
    UTILITY("utility");

    private String type;

    ChargingSource(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
