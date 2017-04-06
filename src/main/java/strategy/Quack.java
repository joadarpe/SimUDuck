package strategy;

import strategy.api.QuackBehavior;

/**
 * @author JonathanA.
 */
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack!");
    }
}
