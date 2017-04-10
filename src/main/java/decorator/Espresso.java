package decorator;

import decorator.base.Beverage;

/**
 * @author JonathanA.
 */
public class Espresso extends Beverage {

    public Espresso(Size size) {
        description = "Espresso";
        this.size = size;
    }

    @Override
    public double cost() {
        return 1.99 * size.getCostCoefficient();
    }
}
