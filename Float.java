package behavior;

// Implements floating behavior
public class Float implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("This duck is floating on water.");
    }
}
