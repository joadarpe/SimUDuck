package strategy;

import strategy.api.FlyBehavior;

/**
 * @author JonathanA.
 */
public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
