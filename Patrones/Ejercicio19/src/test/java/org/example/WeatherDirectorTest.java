package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WeatherDirectorTest {
    private WeatherDirector director;

    @BeforeEach
    void setUp() {
        this.director = new WeatherDirector(new HomeWeatherStation(86, 1008, 200));
    }

    @Test
    public void addDecoratorsInFahrenheit() {
        director.addAverage();
        director.addMaxMin();
        System.out.println(director.displayData());
    }

    @Test
    public void addDecoratorsInCelsius() {
        director.addCelsiusTemp();
        director.addAverage();
        director.addMaxMin();
        System.out.println(director.displayData());
    }
}
