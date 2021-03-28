package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Objects;
import java.util.UUID;

public class EventDTO {

    @JsonProperty("device_id")
    private UUID deviceId;

    @Min(1)
    private UUID region;

    @Min(-1_000)
    @Max(1_000)
    private short charging;
    @JsonProperty("charging_source")
    private ChargingSource chargingSource;
    @Max(13_000)
    @Min(0)
    @JsonProperty("current_capacity")
    private short currentCapacity;
    @Max(225)
    @Min(-5)
    @JsonProperty("moduleL_temp")
    private short moduleLTemperature;
    @Max(225)
    @Min(-5)
    @JsonProperty("moduleR_temp")
    private short moduleRTemperature;
    @Max(225)
    @Min(-5)
    @JsonProperty("processor1_temp")
    private short processor1Temp;
    @Max(225)
    @Min(-5)
    @JsonProperty("processor2_temp")
    private short processor2Temp;
    @Max(225)
    @Min(-5)
    @JsonProperty("processor3_temp")
    private short processor3Temp;
    @Max(225)
    @Min(-5)
    @JsonProperty("processor4_temp")
    private short processor4Temp;
    @Max(225)
    @Min(-5)
    @JsonProperty("inverter_state")
    private short inverterState;

    @JsonProperty("SoC_regulator")
    private float soCRegulator;

    public short getCharging() {
        return charging;
    }

    public ChargingSource getChargingSource() {
        return chargingSource;
    }

    public short getCurrentCapacity() {
        return currentCapacity;
    }

    public short getModuleLTemperature() {
        return moduleLTemperature;
    }

    public short getModuleRTemperature() {
        return moduleRTemperature;
    }

    public short getProcessor1Temp() {
        return processor1Temp;
    }

    public short getProcessor2Temp() {
        return processor2Temp;
    }


    public short getProcessor3Temp() {
        return processor3Temp;
    }

    public short getProcessor4Temp() {
        return processor4Temp;
    }

    public short getInverterState() {
        return inverterState;
    }


    public float getSoCRegulator() {
        return soCRegulator;
    }


    public UUID getDeviceId() {
        return deviceId;
    }

    public UUID getRegion() {
        return region;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventDTO eventDTO = (EventDTO) o;
        return region == eventDTO.region && charging == eventDTO.charging && currentCapacity == eventDTO.currentCapacity && moduleLTemperature == eventDTO.moduleLTemperature && moduleRTemperature == eventDTO.moduleRTemperature && processor1Temp == eventDTO.processor1Temp && processor2Temp == eventDTO.processor2Temp && processor3Temp == eventDTO.processor3Temp && processor4Temp == eventDTO.processor4Temp && inverterState == eventDTO.inverterState && Float.compare(eventDTO.soCRegulator, soCRegulator) == 0 && Objects.equals(deviceId, eventDTO.deviceId) && chargingSource == eventDTO.chargingSource;
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceId, region, charging, chargingSource, currentCapacity, moduleLTemperature, moduleRTemperature, processor1Temp, processor2Temp, processor3Temp, processor4Temp, inverterState, soCRegulator);
    }
}
