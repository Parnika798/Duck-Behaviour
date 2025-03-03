package ducks;

import behavior.Fly;
import behavior.Swim;

public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        super(new Fly(), new Swim());
    }

    @Override
    public void display() {
        System.out.println("I'm a Red Head Duck.");
    }
}
