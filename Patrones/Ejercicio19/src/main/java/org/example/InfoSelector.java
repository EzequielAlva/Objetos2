package org.example;

public class InfoSelector {
    private final WeatherData weatherFromHome; // solo para reiniciar fácilmente
    private WeatherData weatherInfo;

    public InfoSelector(WeatherData weatherFromHome) {
        this.weatherFromHome = weatherFromHome;
        this.weatherInfo = this.weatherFromHome;
    }

    public void setWeatherStrategy(WeatherData  temperatureScale) {
        this.weatherInfo = temperatureScale;
    }

    public void addAverage() {
        this.weatherInfo = new AverageTemp(this.weatherInfo);
    }

    public void addMaxAndMin() {
        this.weatherInfo = new AverageTemp(this.weatherInfo);
        this.weatherInfo = new MaxAndMin(this.weatherInfo);
    }

    public String returnInformation() {
        return this.weatherInfo.displayData();
    }

    public void reset() {
        this.weatherInfo = this.weatherFromHome;
    }
}
