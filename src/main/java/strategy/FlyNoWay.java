package strategy;

import strategy.api.FlyBehavior;

/**
 * @author JonathanA.
 */
public class FlyNoWay implements FlyBehavior {


    public void fly() {
        System.out.println("I can't fly :'(");
    }
}
