package com.example.temperatureconverter.model;

public class Temperature {
    private double value;
    private String scale;

    public Temperature(double value, String scale) {
        this.value = value;
        this.scale = scale;
    }

    public double convert() {
        if ("C".equalsIgnoreCase(scale)) {
            return (value * 9 / 5) + 32;
        } else {
            return (value - 32) * 5 / 9;
        }
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }
}
