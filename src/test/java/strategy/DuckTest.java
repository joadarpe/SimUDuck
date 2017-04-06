package strategy;

import org.testng.annotations.Test;

/**
 * @author JonathanA.
 */
public class DuckTest {

    @Test
    public void mallardDuckTest() {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
    }

    @Test
    public void ModelDuckTest() {
        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        // Change behavior at runtime
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }

}