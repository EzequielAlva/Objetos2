package org.example;

public class WeatherDirector {
    private WeatherData weatherStation;
    private HomeWeatherStation station; //para resetear facilmente

    public WeatherDirector(HomeWeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        this.station = weatherStation;
    }

    public void addCelsiusTemp() {
        this.weatherStation = new CelsiusDecorator(this.weatherStation);
    }

    public void addAverage() {
        this.weatherStation = new AverageDecorator(this.weatherStation);
    }

    public  void addMaxMin() {
        this.weatherStation = new MaxMinDecorator(this.weatherStation);
    }

    public void reset() {
        this.weatherStation = this.station;
    }

    public String displayData() {
        return this.weatherStation.displayData();
    }
}
