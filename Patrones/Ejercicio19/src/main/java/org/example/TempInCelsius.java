package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class TempInCelsius implements WeatherData {
    private HomeWeatherStation homeWeather;

    public TempInCelsius(HomeWeatherStation homeWeather) {
        this.homeWeather = homeWeather;
    }

    @Override
    public double getTemperatura() {
        return redondearValor((this.homeWeather.getTemperatura() - 32) / 1.8);
    }

    @Override
    public double getPresion() {
        return this.homeWeather.getPresion();
    }

    @Override
    public double getRadiacionSolar() {
        return this.homeWeather.getRadiacionSolar();
    }

    private double setTemperatura(double temp) {
        return redondearValor((temp - 32) / 1.8);
    }

    @Override
    public List<Double> getTemperaturas() {
        return this.homeWeather.getTemperaturas().stream()
                .map(elem -> this.setTemperatura(elem))
                .collect(Collectors.toList());
    }

    @Override
    public String displayData() {
        String original = this.homeWeather.displayData();
        int primerPuntoyComa = original.indexOf(";");
        String nuevaTemperatura = "Temperatura C: " + this.getTemperatura();
        return nuevaTemperatura + original.substring(primerPuntoyComa);
    }

    private double redondearValor(double valor) {
        return Math.round(valor);
    }
}
