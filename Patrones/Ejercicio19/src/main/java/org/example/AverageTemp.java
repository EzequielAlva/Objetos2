package org.example;

public class AverageTemp extends WeatherDecorator {

    public AverageTemp(WeatherData weather) {
        super(weather);
    }

    private double calculateAverage() {
        return getTemperaturas().stream()
                .mapToDouble(elem -> elem)
                .average()
                .orElse(0);
    }

    @Override
    public String displayData() {
        return super.displayData() + " Promedio: " + this.redondearValor(this.calculateAverage()) + ";";
    }
}
