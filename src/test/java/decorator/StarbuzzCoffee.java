package decorator;

import decorator.base.Beverage;
import org.testng.annotations.Test;

/**
 * @author JonathanA.
 */
public class StarbuzzCoffee {

    @Test
    public void StarbuzzCoffeeTest() {
        final String format = "%s $%.2f\n";
        Beverage beverage = new Espresso(Beverage.Size.SMALL);
        System.out.printf(format, beverage.getDescription(), beverage.cost());

        Beverage beverage1 = new DarkRoast(Beverage.Size.MEDIUM);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.printf(format, beverage1.getDescription(), beverage1.cost());

        Beverage beverage2 = new HouseBlend(Beverage.Size.LARGE);
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.printf(format, beverage2.getDescription(), beverage2.cost());
    }

}