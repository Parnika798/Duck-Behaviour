package ducks;

import behavior.FlyBehavior;
import behavior.SwimBehavior;

// Abstract Duck class
public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected SwimBehavior swimBehavior;

    public Duck(FlyBehavior flyBehavior, SwimBehavior swimBehavior) {
        this.flyBehavior = flyBehavior;
        this.swimBehavior = swimBehavior;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performSwim() {
        swimBehavior.swim();
    }

    public abstract void display();
}
