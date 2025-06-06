package org.example;

public class MaxMinDecorator extends WeatherDecorator {
    public MaxMinDecorator(WeatherData weather) {
        super(weather);
    }

    private double obtainMax() {
        return super.getTemperaturas().stream()
                .mapToDouble(Double::doubleValue)
                .max().orElse(0);
    }

    private double obtainMin() {
        return super.getTemperaturas().stream()
                .mapToDouble(Double::doubleValue)
                .min().orElse(0);
    }

    @Override
    protected String addedInformation() {
        return "Mínimo: " + this.obtainMin() + " Máximo: " + this.obtainMax() + "; ";
    }
}
