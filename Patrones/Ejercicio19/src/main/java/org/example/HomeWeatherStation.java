package org.example;

import java.util.ArrayList;
import java.util.List;

public class HomeWeatherStation implements WeatherData {
    private double tempFahrenheit;
    private double presion;
    private double radiacionSlar;
    private List<Double> temperaturas;

    public HomeWeatherStation(double tempFahrenheit, double presion, double radiacionSlar) {
        this.tempFahrenheit = tempFahrenheit;
        this.presion = presion;
        this.radiacionSlar = radiacionSlar;
        temperaturas = new ArrayList<>(List.of(120.0, 80.3, 93.6));
        temperaturas.add(this.tempFahrenheit);
    }

    //retorna la temperatura en grados Fahrenheit.
    public double getTemperatura() {
        return this.tempFahrenheit;
    }

    //retorna la presión atmosférica en hPa
    public double getPresion() {
        return this.presion;
    }

    //retorna la radiación solar
    public double getRadiacionSolar() {
        return this.radiacionSlar;
    }

    //retorna una lista con todas las temperaturas sensadas hasta el
    //momento, en grados Fahrenheit
    public List<Double> getTemperaturas() {
        return this.temperaturas;
    }

    //retorna  un reporte de todos los datos: temperatura, presión, y
    //radiación solar.
    public String displayData(){
        return "Temperatura F: " + this.getTemperatura() + "; " +
                "Presión atmosferica: " + this.getPresion() + "; " +
                "Radiación solar: " + this.getRadiacionSolar() + ";";
    }
}
