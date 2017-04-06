package observer.api;

/**
 * @author JonathanA.
 */
public interface Observer {

    void update(float temp, float humidity, float pressure);
}
