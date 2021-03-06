package com.theironyard.weather.entities;

/**
 * Created by Ben on 10/12/16.
 */
public class CurrentWeatherData {
    private String icon;
    private String summary;
    private long temperature;

    public long getTemperature() {
        return temperature;
    }

    public void setTemperature(long temperature) {
        this.temperature = temperature;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
