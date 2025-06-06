package org.example;

import java.util.List;

public abstract class WeatherDecorator implements WeatherData {
    private WeatherData weather;

    public WeatherDecorator(WeatherData weather) {
        this.weather = weather;
    }

    protected WeatherData  getWeather() {
        return this.weather;
    }

    @Override
    public double getTemperatura() {
        return this.weather.getTemperatura();
    }

    @Override
    public double getPresion() {
        return this.weather.getPresion();
    }

    @Override
    public double getRadiacionSolar() {
        return this.weather.getRadiacionSolar();
    }

    @Override
    public List<Double> getTemperaturas() {
        return this.weather.getTemperaturas();
    }

    @Override
    public String displayData() {
        return this.weather.displayData() + this.addedInformation();
    }

    protected abstract String addedInformation();
}
