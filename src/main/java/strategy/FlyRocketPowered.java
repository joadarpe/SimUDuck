package strategy;

import strategy.api.FlyBehavior;

/**
 * @author JonathanA.
 */
public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
