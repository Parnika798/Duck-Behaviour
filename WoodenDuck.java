package ducks;

import behavior.NotFly;
import behavior.Float;

public class WoodenDuck extends Duck {
    public WoodenDuck() {
        super(new NotFly(), new Float());
    }

    @Override
    public void display() {
        System.out.println("I'm a Wooden Duck.");
    }
}
