package ducks;

import behavior.NotFly;
import behavior.Float;

public class RubberDuck extends Duck {
    public RubberDuck() {
        super(new NotFly(), new Float());
    }

    @Override
    public void display() {
        System.out.println("I'm a Rubber Duck.");
    }
}
