package behavior;

// Implements flying behavior
public class Fly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("This duck can fly!");
    }
}
