package decorator;

import decorator.base.Beverage;

/**
 * @author JonathanA.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
