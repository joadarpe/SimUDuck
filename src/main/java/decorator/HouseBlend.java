package decorator;

import decorator.base.Beverage;

/**
 * @author JonathanA.
 */
public class HouseBlend extends Beverage {

    public HouseBlend(Size size) {
        description = "House Blend Coffee";
        this.size = size;
    }

    @Override
    public double cost() {
        return 0.89 * size.getCostCoefficient();
    }
}
