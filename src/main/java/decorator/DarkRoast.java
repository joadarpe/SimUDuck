package decorator;

import decorator.base.Beverage;

/**
 * @author JonathanA.
 */
public class DarkRoast extends Beverage {

    public DarkRoast(Size size) {
        description = "Dark Roast Coffee";
        this.size = size;
    }

    @Override
    public double cost() {
        return 0.89 * size.getCostCoefficient();
    }
}
