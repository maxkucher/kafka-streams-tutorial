/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.maxkucher.energyresources;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class BatteryEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -7263489741591096539L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"BatteryEvent\",\"namespace\":\"com.maxkucher.energyresources\",\"fields\":[{\"name\":\"device_id\",\"type\":\"string\"},{\"name\":\"region\",\"type\":\"string\"},{\"name\":\"charging\",\"type\":\"int\"},{\"name\":\"charging_source\",\"type\":{\"type\":\"enum\",\"name\":\"ChargingSource\",\"symbols\":[\"solar\",\"utility\"]}},{\"name\":\"moduleL_temp\",\"type\":\"int\"},{\"name\":\"moduleR_temp\",\"type\":\"int\"},{\"name\":\"processor1_temp\",\"type\":\"int\"},{\"name\":\"processor2_temp\",\"type\":\"int\"},{\"name\":\"processor3_temp\",\"type\":\"int\"},{\"name\":\"processor4_temp\",\"type\":\"int\"},{\"name\":\"inverter_state\",\"type\":\"int\"},{\"name\":\"SoC_regulator\",\"type\":\"float\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence device_id;
  @Deprecated public java.lang.CharSequence region;
  @Deprecated public int charging;
  @Deprecated public com.maxkucher.energyresources.ChargingSource charging_source;
  @Deprecated public int moduleL_temp;
  @Deprecated public int moduleR_temp;
  @Deprecated public int processor1_temp;
  @Deprecated public int processor2_temp;
  @Deprecated public int processor3_temp;
  @Deprecated public int processor4_temp;
  @Deprecated public int inverter_state;
  @Deprecated public float SoC_regulator;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public BatteryEvent() {}

  /**
   * All-args constructor.
   */
  public BatteryEvent(java.lang.CharSequence device_id, java.lang.CharSequence region, java.lang.Integer charging, com.maxkucher.energyresources.ChargingSource charging_source, java.lang.Integer moduleL_temp, java.lang.Integer moduleR_temp, java.lang.Integer processor1_temp, java.lang.Integer processor2_temp, java.lang.Integer processor3_temp, java.lang.Integer processor4_temp, java.lang.Integer inverter_state, java.lang.Float SoC_regulator) {
    this.device_id = device_id;
    this.region = region;
    this.charging = charging;
    this.charging_source = charging_source;
    this.moduleL_temp = moduleL_temp;
    this.moduleR_temp = moduleR_temp;
    this.processor1_temp = processor1_temp;
    this.processor2_temp = processor2_temp;
    this.processor3_temp = processor3_temp;
    this.processor4_temp = processor4_temp;
    this.inverter_state = inverter_state;
    this.SoC_regulator = SoC_regulator;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return device_id;
    case 1: return region;
    case 2: return charging;
    case 3: return charging_source;
    case 4: return moduleL_temp;
    case 5: return moduleR_temp;
    case 6: return processor1_temp;
    case 7: return processor2_temp;
    case 8: return processor3_temp;
    case 9: return processor4_temp;
    case 10: return inverter_state;
    case 11: return SoC_regulator;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: device_id = (java.lang.CharSequence)value$; break;
    case 1: region = (java.lang.CharSequence)value$; break;
    case 2: charging = (java.lang.Integer)value$; break;
    case 3: charging_source = (com.maxkucher.energyresources.ChargingSource)value$; break;
    case 4: moduleL_temp = (java.lang.Integer)value$; break;
    case 5: moduleR_temp = (java.lang.Integer)value$; break;
    case 6: processor1_temp = (java.lang.Integer)value$; break;
    case 7: processor2_temp = (java.lang.Integer)value$; break;
    case 8: processor3_temp = (java.lang.Integer)value$; break;
    case 9: processor4_temp = (java.lang.Integer)value$; break;
    case 10: inverter_state = (java.lang.Integer)value$; break;
    case 11: SoC_regulator = (java.lang.Float)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'device_id' field.
   */
  public java.lang.CharSequence getDeviceId() {
    return device_id;
  }

  /**
   * Sets the value of the 'device_id' field.
   * @param value the value to set.
   */
  public void setDeviceId(java.lang.CharSequence value) {
    this.device_id = value;
  }

  /**
   * Gets the value of the 'region' field.
   */
  public java.lang.CharSequence getRegion() {
    return region;
  }

  /**
   * Sets the value of the 'region' field.
   * @param value the value to set.
   */
  public void setRegion(java.lang.CharSequence value) {
    this.region = value;
  }

  /**
   * Gets the value of the 'charging' field.
   */
  public java.lang.Integer getCharging() {
    return charging;
  }

  /**
   * Sets the value of the 'charging' field.
   * @param value the value to set.
   */
  public void setCharging(java.lang.Integer value) {
    this.charging = value;
  }

  /**
   * Gets the value of the 'charging_source' field.
   */
  public com.maxkucher.energyresources.ChargingSource getChargingSource() {
    return charging_source;
  }

  /**
   * Sets the value of the 'charging_source' field.
   * @param value the value to set.
   */
  public void setChargingSource(com.maxkucher.energyresources.ChargingSource value) {
    this.charging_source = value;
  }

  /**
   * Gets the value of the 'moduleL_temp' field.
   */
  public java.lang.Integer getModuleLTemp() {
    return moduleL_temp;
  }

  /**
   * Sets the value of the 'moduleL_temp' field.
   * @param value the value to set.
   */
  public void setModuleLTemp(java.lang.Integer value) {
    this.moduleL_temp = value;
  }

  /**
   * Gets the value of the 'moduleR_temp' field.
   */
  public java.lang.Integer getModuleRTemp() {
    return moduleR_temp;
  }

  /**
   * Sets the value of the 'moduleR_temp' field.
   * @param value the value to set.
   */
  public void setModuleRTemp(java.lang.Integer value) {
    this.moduleR_temp = value;
  }

  /**
   * Gets the value of the 'processor1_temp' field.
   */
  public java.lang.Integer getProcessor1Temp() {
    return processor1_temp;
  }

  /**
   * Sets the value of the 'processor1_temp' field.
   * @param value the value to set.
   */
  public void setProcessor1Temp(java.lang.Integer value) {
    this.processor1_temp = value;
  }

  /**
   * Gets the value of the 'processor2_temp' field.
   */
  public java.lang.Integer getProcessor2Temp() {
    return processor2_temp;
  }

  /**
   * Sets the value of the 'processor2_temp' field.
   * @param value the value to set.
   */
  public void setProcessor2Temp(java.lang.Integer value) {
    this.processor2_temp = value;
  }

  /**
   * Gets the value of the 'processor3_temp' field.
   */
  public java.lang.Integer getProcessor3Temp() {
    return processor3_temp;
  }

  /**
   * Sets the value of the 'processor3_temp' field.
   * @param value the value to set.
   */
  public void setProcessor3Temp(java.lang.Integer value) {
    this.processor3_temp = value;
  }

  /**
   * Gets the value of the 'processor4_temp' field.
   */
  public java.lang.Integer getProcessor4Temp() {
    return processor4_temp;
  }

  /**
   * Sets the value of the 'processor4_temp' field.
   * @param value the value to set.
   */
  public void setProcessor4Temp(java.lang.Integer value) {
    this.processor4_temp = value;
  }

  /**
   * Gets the value of the 'inverter_state' field.
   */
  public java.lang.Integer getInverterState() {
    return inverter_state;
  }

  /**
   * Sets the value of the 'inverter_state' field.
   * @param value the value to set.
   */
  public void setInverterState(java.lang.Integer value) {
    this.inverter_state = value;
  }

  /**
   * Gets the value of the 'SoC_regulator' field.
   */
  public java.lang.Float getSoCRegulator() {
    return SoC_regulator;
  }

  /**
   * Sets the value of the 'SoC_regulator' field.
   * @param value the value to set.
   */
  public void setSoCRegulator(java.lang.Float value) {
    this.SoC_regulator = value;
  }

  /**
   * Creates a new BatteryEvent RecordBuilder.
   * @return A new BatteryEvent RecordBuilder
   */
  public static com.maxkucher.energyresources.BatteryEvent.Builder newBuilder() {
    return new com.maxkucher.energyresources.BatteryEvent.Builder();
  }
  
  /**
   * Creates a new BatteryEvent RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new BatteryEvent RecordBuilder
   */
  public static com.maxkucher.energyresources.BatteryEvent.Builder newBuilder(com.maxkucher.energyresources.BatteryEvent.Builder other) {
    return new com.maxkucher.energyresources.BatteryEvent.Builder(other);
  }
  
  /**
   * Creates a new BatteryEvent RecordBuilder by copying an existing BatteryEvent instance.
   * @param other The existing instance to copy.
   * @return A new BatteryEvent RecordBuilder
   */
  public static com.maxkucher.energyresources.BatteryEvent.Builder newBuilder(com.maxkucher.energyresources.BatteryEvent other) {
    return new com.maxkucher.energyresources.BatteryEvent.Builder(other);
  }
  
  /**
   * RecordBuilder for BatteryEvent instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<BatteryEvent>
    implements org.apache.avro.data.RecordBuilder<BatteryEvent> {

    private java.lang.CharSequence device_id;
    private java.lang.CharSequence region;
    private int charging;
    private com.maxkucher.energyresources.ChargingSource charging_source;
    private int moduleL_temp;
    private int moduleR_temp;
    private int processor1_temp;
    private int processor2_temp;
    private int processor3_temp;
    private int processor4_temp;
    private int inverter_state;
    private float SoC_regulator;

    /** Creates a new Builder */
    private Builder() {
      super(com.maxkucher.energyresources.BatteryEvent.SCHEMA$);
    }
    
    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.maxkucher.energyresources.BatteryEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.device_id)) {
        this.device_id = data().deepCopy(fields()[0].schema(), other.device_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.region)) {
        this.region = data().deepCopy(fields()[1].schema(), other.region);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.charging)) {
        this.charging = data().deepCopy(fields()[2].schema(), other.charging);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.charging_source)) {
        this.charging_source = data().deepCopy(fields()[3].schema(), other.charging_source);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.moduleL_temp)) {
        this.moduleL_temp = data().deepCopy(fields()[4].schema(), other.moduleL_temp);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.moduleR_temp)) {
        this.moduleR_temp = data().deepCopy(fields()[5].schema(), other.moduleR_temp);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.processor1_temp)) {
        this.processor1_temp = data().deepCopy(fields()[6].schema(), other.processor1_temp);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.processor2_temp)) {
        this.processor2_temp = data().deepCopy(fields()[7].schema(), other.processor2_temp);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.processor3_temp)) {
        this.processor3_temp = data().deepCopy(fields()[8].schema(), other.processor3_temp);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.processor4_temp)) {
        this.processor4_temp = data().deepCopy(fields()[9].schema(), other.processor4_temp);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.inverter_state)) {
        this.inverter_state = data().deepCopy(fields()[10].schema(), other.inverter_state);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.SoC_regulator)) {
        this.SoC_regulator = data().deepCopy(fields()[11].schema(), other.SoC_regulator);
        fieldSetFlags()[11] = true;
      }
    }
    
    /**
     * Creates a Builder by copying an existing BatteryEvent instance
     * @param other The existing instance to copy.
     */
    private Builder(com.maxkucher.energyresources.BatteryEvent other) {
            super(com.maxkucher.energyresources.BatteryEvent.SCHEMA$);
      if (isValidValue(fields()[0], other.device_id)) {
        this.device_id = data().deepCopy(fields()[0].schema(), other.device_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.region)) {
        this.region = data().deepCopy(fields()[1].schema(), other.region);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.charging)) {
        this.charging = data().deepCopy(fields()[2].schema(), other.charging);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.charging_source)) {
        this.charging_source = data().deepCopy(fields()[3].schema(), other.charging_source);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.moduleL_temp)) {
        this.moduleL_temp = data().deepCopy(fields()[4].schema(), other.moduleL_temp);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.moduleR_temp)) {
        this.moduleR_temp = data().deepCopy(fields()[5].schema(), other.moduleR_temp);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.processor1_temp)) {
        this.processor1_temp = data().deepCopy(fields()[6].schema(), other.processor1_temp);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.processor2_temp)) {
        this.processor2_temp = data().deepCopy(fields()[7].schema(), other.processor2_temp);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.processor3_temp)) {
        this.processor3_temp = data().deepCopy(fields()[8].schema(), other.processor3_temp);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.processor4_temp)) {
        this.processor4_temp = data().deepCopy(fields()[9].schema(), other.processor4_temp);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.inverter_state)) {
        this.inverter_state = data().deepCopy(fields()[10].schema(), other.inverter_state);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.SoC_regulator)) {
        this.SoC_regulator = data().deepCopy(fields()[11].schema(), other.SoC_regulator);
        fieldSetFlags()[11] = true;
      }
    }

    /**
      * Gets the value of the 'device_id' field.
      * @return The value.
      */
    public java.lang.CharSequence getDeviceId() {
      return device_id;
    }

    /**
      * Sets the value of the 'device_id' field.
      * @param value The value of 'device_id'.
      * @return This builder.
      */
    public com.maxkucher.energyresources.BatteryEvent.Builder setDeviceId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.device_id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }

    /**
      * Checks whether the 'device_id' field has been set.
      * @return True if the 'device_id' field has been set, false otherwise.
      */
    public boolean hasDeviceId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'device_id' field.
      * @return This builder.
      */
    public com.maxkucher.energyresources.BatteryEvent.Builder clearDeviceId() {
      device_id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'region' field.
      * @return The value.
      */
    public java.lang.CharSequence getRegion() {
      return region;
    }

    /**
      * Sets the value of the 'region' field.
      * @param value The value of 'region'.
      * @return This builder.
      */
    public com.maxkucher.energyresources.BatteryEvent.Builder setRegion(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.region = value;
      fieldSetFlags()[1] = true;
      return this; 
    }

    /**
      * Checks whether the 'region' field has been set.
      * @return True if the 'region' field has been set, false otherwise.
      */
    public boolean hasRegion() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'region' field.
      * @return This builder.
      */
    public com.maxkucher.energyresources.BatteryEvent.Builder clearRegion() {
      region = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'charging' field.
      * @return The value.
      */
    public java.lang.Integer getCharging() {
      return charging;
    }

    /**
      * Sets the value of the 'charging' field.
      * @param value The value of 'charging'.
      * @return This builder.
      */
    public com.maxkucher.energyresources.BatteryEvent.Builder setCharging(int value) {
      validate(fields()[2], value);
      this.charging = value;
      fieldSetFlags()[2] = true;
      return this; 
    }

    /**
      * Checks whether the 'charging' field has been set.
      * @return True if the 'charging' field has been set, false otherwise.
      */
    public boolean hasCharging() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'charging' field.
      * @return This builder.
      */
    public com.maxkucher.energyresources.BatteryEvent.Builder clearCharging() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'charging_source' field.
      * @return The value.
      */
    public com.maxkucher.energyresources.ChargingSource getChargingSource() {
      return charging_source;
    }

    /**
      * Sets the value of the 'charging_source' field.
      * @param value The value of 'charging_source'.
      * @return This builder.
      */
    public com.maxkucher.energyresources.BatteryEvent.Builder setChargingSource(com.maxkucher.energyresources.ChargingSource value) {
      validate(fields()[3], value);
      this.charging_source = value;
      fieldSetFlags()[3] = true;
      return this; 
    }

    /**
      * Checks whether the 'charging_source' field has been set.
      * @return True if the 'charging_source' field has been set, false otherwise.
      */
    public boolean hasChargingSource() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'charging_source' field.
      * @return This builder.
      */
    public com.maxkucher.energyresources.BatteryEvent.Builder clearChargingSource() {
      charging_source = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'moduleL_temp' field.
      * @return The value.
      */
    public java.lang.Integer getModuleLTemp() {
      return moduleL_temp;
    }

    /**
      * Sets the value of the 'moduleL_temp' field.
      * @param value The value of 'moduleL_temp'.
      * @return This builder.
      */
    public com.maxkucher.energyresources.BatteryEvent.Builder setModuleLTemp(int value) {
      validate(fields()[4], value);
      this.moduleL_temp = value;
      fieldSetFlags()[4] = true;
      return this; 
    }

    /**
      * Checks whether the 'moduleL_temp' field has been set.
      * @return True if the 'moduleL_temp' field has been set, false otherwise.
      */
    public boolean hasModuleLTemp() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'moduleL_temp' field.
      * @return This builder.
      */
    public com.maxkucher.energyresources.BatteryEvent.Builder clearModuleLTemp() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'moduleR_temp' field.
      * @return The value.
      */
    public java.lang.Integer getModuleRTemp() {
      return moduleR_temp;
    }

    /**
      * Sets the value of the 'moduleR_temp' field.
      * @param value The value of 'moduleR_temp'.
      * @return This builder.
      */
    public com.maxkucher.energyresources.BatteryEvent.Builder setModuleRTemp(int value) {
      validate(fields()[5], value);
      this.moduleR_temp = value;
      fieldSetFlags()[5] = true;
      return this; 
    }

    /**
      * Checks whether the 'moduleR_temp' field has been set.
      * @return True if the 'moduleR_temp' field has been set, false otherwise.
      */
    public boolean hasModuleRTemp() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'moduleR_temp' field.
      * @return This builder.
      */
    public com.maxkucher.energyresources.BatteryEvent.Builder clearModuleRTemp() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'processor1_temp' field.
      * @return The value.
      */
    public java.lang.Integer getProcessor1Temp() {
      return processor1_temp;
    }

    /**
      * Sets the value of the 'processor1_temp' field.
      * @param value The value of 'processor1_temp'.
      * @return This builder.
      */
    public com.maxkucher.energyresources.BatteryEvent.Builder setProcessor1Temp(int value) {
      validate(fields()[6], value);
      this.processor1_temp = value;
      fieldSetFlags()[6] = true;
      return this; 
    }

    /**
      * Checks whether the 'processor1_temp' field has been set.
      * @return True if the 'processor1_temp' field has been set, false otherwise.
      */
    public boolean hasProcessor1Temp() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'processor1_temp' field.
      * @return This builder.
      */
    public com.maxkucher.energyresources.BatteryEvent.Builder clearProcessor1Temp() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'processor2_temp' field.
      * @return The value.
      */
    public java.lang.Integer getProcessor2Temp() {
      return processor2_temp;
    }

    /**
      * Sets the value of the 'processor2_temp' field.
      * @param value The value of 'processor2_temp'.
      * @return This builder.
      */
    public com.maxkucher.energyresources.BatteryEvent.Builder setProcessor2Temp(int value) {
      validate(fields()[7], value);
      this.processor2_temp = value;
      fieldSetFlags()[7] = true;
      return this; 
    }

    /**
      * Checks whether the 'processor2_temp' field has been set.
      * @return True if the 'processor2_temp' field has been set, false otherwise.
      */
    public boolean hasProcessor2Temp() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'processor2_temp' field.
      * @return This builder.
      */
    public com.maxkucher.energyresources.BatteryEvent.Builder clearProcessor2Temp() {
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'processor3_temp' field.
      * @return The value.
      */
    public java.lang.Integer getProcessor3Temp() {
      return processor3_temp;
    }

    /**
      * Sets the value of the 'processor3_temp' field.
      * @param value The value of 'processor3_temp'.
      * @return This builder.
      */
    public com.maxkucher.energyresources.BatteryEvent.Builder setProcessor3Temp(int value) {
      validate(fields()[8], value);
      this.processor3_temp = value;
      fieldSetFlags()[8] = true;
      return this; 
    }

    /**
      * Checks whether the 'processor3_temp' field has been set.
      * @return True if the 'processor3_temp' field has been set, false otherwise.
      */
    public boolean hasProcessor3Temp() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'processor3_temp' field.
      * @return This builder.
      */
    public com.maxkucher.energyresources.BatteryEvent.Builder clearProcessor3Temp() {
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'processor4_temp' field.
      * @return The value.
      */
    public java.lang.Integer getProcessor4Temp() {
      return processor4_temp;
    }

    /**
      * Sets the value of the 'processor4_temp' field.
      * @param value The value of 'processor4_temp'.
      * @return This builder.
      */
    public com.maxkucher.energyresources.BatteryEvent.Builder setProcessor4Temp(int value) {
      validate(fields()[9], value);
      this.processor4_temp = value;
      fieldSetFlags()[9] = true;
      return this; 
    }

    /**
      * Checks whether the 'processor4_temp' field has been set.
      * @return True if the 'processor4_temp' field has been set, false otherwise.
      */
    public boolean hasProcessor4Temp() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'processor4_temp' field.
      * @return This builder.
      */
    public com.maxkucher.energyresources.BatteryEvent.Builder clearProcessor4Temp() {
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
      * Gets the value of the 'inverter_state' field.
      * @return The value.
      */
    public java.lang.Integer getInverterState() {
      return inverter_state;
    }

    /**
      * Sets the value of the 'inverter_state' field.
      * @param value The value of 'inverter_state'.
      * @return This builder.
      */
    public com.maxkucher.energyresources.BatteryEvent.Builder setInverterState(int value) {
      validate(fields()[10], value);
      this.inverter_state = value;
      fieldSetFlags()[10] = true;
      return this; 
    }

    /**
      * Checks whether the 'inverter_state' field has been set.
      * @return True if the 'inverter_state' field has been set, false otherwise.
      */
    public boolean hasInverterState() {
      return fieldSetFlags()[10];
    }


    /**
      * Clears the value of the 'inverter_state' field.
      * @return This builder.
      */
    public com.maxkucher.energyresources.BatteryEvent.Builder clearInverterState() {
      fieldSetFlags()[10] = false;
      return this;
    }

    /**
      * Gets the value of the 'SoC_regulator' field.
      * @return The value.
      */
    public java.lang.Float getSoCRegulator() {
      return SoC_regulator;
    }

    /**
      * Sets the value of the 'SoC_regulator' field.
      * @param value The value of 'SoC_regulator'.
      * @return This builder.
      */
    public com.maxkucher.energyresources.BatteryEvent.Builder setSoCRegulator(float value) {
      validate(fields()[11], value);
      this.SoC_regulator = value;
      fieldSetFlags()[11] = true;
      return this; 
    }

    /**
      * Checks whether the 'SoC_regulator' field has been set.
      * @return True if the 'SoC_regulator' field has been set, false otherwise.
      */
    public boolean hasSoCRegulator() {
      return fieldSetFlags()[11];
    }


    /**
      * Clears the value of the 'SoC_regulator' field.
      * @return This builder.
      */
    public com.maxkucher.energyresources.BatteryEvent.Builder clearSoCRegulator() {
      fieldSetFlags()[11] = false;
      return this;
    }

    @Override
    public BatteryEvent build() {
      try {
        BatteryEvent record = new BatteryEvent();
        record.device_id = fieldSetFlags()[0] ? this.device_id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.region = fieldSetFlags()[1] ? this.region : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.charging = fieldSetFlags()[2] ? this.charging : (java.lang.Integer) defaultValue(fields()[2]);
        record.charging_source = fieldSetFlags()[3] ? this.charging_source : (com.maxkucher.energyresources.ChargingSource) defaultValue(fields()[3]);
        record.moduleL_temp = fieldSetFlags()[4] ? this.moduleL_temp : (java.lang.Integer) defaultValue(fields()[4]);
        record.moduleR_temp = fieldSetFlags()[5] ? this.moduleR_temp : (java.lang.Integer) defaultValue(fields()[5]);
        record.processor1_temp = fieldSetFlags()[6] ? this.processor1_temp : (java.lang.Integer) defaultValue(fields()[6]);
        record.processor2_temp = fieldSetFlags()[7] ? this.processor2_temp : (java.lang.Integer) defaultValue(fields()[7]);
        record.processor3_temp = fieldSetFlags()[8] ? this.processor3_temp : (java.lang.Integer) defaultValue(fields()[8]);
        record.processor4_temp = fieldSetFlags()[9] ? this.processor4_temp : (java.lang.Integer) defaultValue(fields()[9]);
        record.inverter_state = fieldSetFlags()[10] ? this.inverter_state : (java.lang.Integer) defaultValue(fields()[10]);
        record.SoC_regulator = fieldSetFlags()[11] ? this.SoC_regulator : (java.lang.Float) defaultValue(fields()[11]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);  

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, org.apache.avro.specific.SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);  

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, org.apache.avro.specific.SpecificData.getDecoder(in));
  }

}
