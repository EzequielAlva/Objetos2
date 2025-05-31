package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InfoSelectorTest {
    private InfoSelector selector;
    private HomeWeatherStation weatherStation;
    private TempInCelsius tempInCelsius;

    @BeforeEach
    void setUp() {
        weatherStation = new HomeWeatherStation(86, 1000, 560);
        tempInCelsius = new TempInCelsius(weatherStation);
        selector = new InfoSelector(weatherStation);
    }

    @Test
    public void addCelsiusTest() {
        System.out.println(selector.returnInformation());
        selector.setWeatherStrategy(tempInCelsius);
        System.out.println(selector.returnInformation());
    }

    @Test
    public void addAverageTest() {
        selector.addAverage();
        System.out.println(selector.returnInformation());
        selector.setWeatherStrategy(tempInCelsius);
        selector.addAverage();
        System.out.println(selector.returnInformation());
    }

    @Test
    public void addMaxAndMinTest() {
        selector.addMaxAndMin();
        System.out.println(selector.returnInformation());
        selector.setWeatherStrategy(tempInCelsius);
        selector.addMaxAndMin();
        System.out.println(selector.returnInformation());

        // al reiniciar los valores vuelven a Fahrenheit y se debe volver a decorar
        selector.reset();
        System.out.println(selector.returnInformation());
    }
}
