package decorator;

import decorator.base.Beverage;
import decorator.base.CondimentDecorator;

/**
 * @author JonathanA.
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.12 + beverage.cost();
    }
}
