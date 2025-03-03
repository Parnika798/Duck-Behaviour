package ducks;

import behavior.NotFly;
import behavior.Drown;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        super(new NotFly(), new Drown());
    }

    @Override
    public void display() {
        System.out.println("I'm a Decoy Duck.");
    }
}
