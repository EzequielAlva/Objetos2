package org.example;

public class AverageDecorator extends WeatherDecorator {
    public AverageDecorator(WeatherData weather) {
        super(weather);
    }

    private double calculateAverage() {
        return super.getTemperaturas().stream()
                .mapToDouble(Double::doubleValue)
                .average().orElse(0);
    }

    @Override
    protected String addedInformation() {
        return "Promedio: " + Math.round(this.calculateAverage()) + "; ";
    }
}
