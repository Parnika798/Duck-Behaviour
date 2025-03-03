package behavior;

// Implements drowning behavior
public class Drown implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("This duck is drowning!");
    }
}
