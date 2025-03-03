package ducks;

import behavior.Fly;
import behavior.Swim;

public class MallardDuck extends Duck {
    public MallardDuck() {
        super(new Fly(), new Swim());
    }

    @Override
    public void display() {
        System.out.println("I'm a Mallard Duck.");
    }
}
