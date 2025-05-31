package org.example;

public class MaxAndMin extends WeatherDecorator {
    public MaxAndMin(WeatherData weather) {
        super(weather);
    }

    private double getMax() {
        return super.getTemperaturas().stream()
                .mapToDouble(elem -> elem)
                .max().getAsDouble();
    }

    private double getMin() {
        return super.getTemperaturas().stream()
                .mapToDouble(Double::doubleValue)
                .min().getAsDouble();
    }

    @Override
    public String displayData() {
        return super.displayData() + " Mínimo: " + getMin() + "; Máximo: " + getMax() + ";";
    }
}
