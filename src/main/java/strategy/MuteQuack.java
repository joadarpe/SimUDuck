package strategy;

import strategy.api.QuackBehavior;

/**
 * @author JonathanA.
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
