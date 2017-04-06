package observer.builtin;

import observer.api.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @author JonathanA.
 */
public class GeneralDisplay implements Observer, DisplayElement {

    private Observable observable;
    private float temperature;
    private float humidity;

    public GeneralDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {

        if (o instanceof WeatherData)
            if (arg == null) // For Pull model
                prepareAndDisplay(o);
            else if (arg instanceof WeatherData)// For Push model
                prepareAndDisplay(arg);
    }

    private void prepareAndDisplay(Object o) {
        WeatherData weatherData = (WeatherData) o;
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
