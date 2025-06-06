package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class CelsiusDecorator extends WeatherDecorator {

    public CelsiusDecorator(WeatherData weather) {
        super(weather);
    }

    private double changeToCelsius(double temp) {
        return Math.round((temp - 32) / 1.8);
    }

    @Override
    public double getTemperatura() {
        return this.changeToCelsius(this.getWeather().getTemperatura());
    }

    @Override
    public List<Double> getTemperaturas() {
        return this.getWeather().getTemperaturas().stream()
                .map(temp -> changeToCelsius(temp))
                .collect(Collectors.toList());
    }

    @Override
    public String displayData() {
        int firstSemicolonIndex = this.getWeather().displayData().indexOf(";");
        return "Temperatura C: "
                + this.getTemperatura()
                + super.displayData().substring(firstSemicolonIndex);
    }

    @Override
    protected String addedInformation() {
        return "";
    }
}
