package behavior;

// Implements swimming behavior
public class Swim implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("This duck swims in water.");
    }
}
