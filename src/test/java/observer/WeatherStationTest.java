package observer;

import org.testng.annotations.Test;

/**
 * @author JonathanA.
 */
public class WeatherStationTest {

    @Test
    public void mallardDuckTest() {

        // Subject
        WeatherData weatherData = new WeatherData();

        // Observer
        new CurrentConditionsDisplay(weatherData);

        // Subject changes
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }

}