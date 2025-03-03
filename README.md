Project Description - 

This project is a Duck Simulation based on O'Reilly's Head First Design Patterns. It follows the Strategy Design Pattern, enabling ducks to exhibit different behaviors dynamically. The project implements FlyBehavior and SwimBehavior as interfaces, allowing each duck type to have its own flying and swimming behavior.


Project Structure -

1. Classes and Methods
   
Duck (Abstract Class)

void display() - Displays the duck's type.

void performSwim() - Calls the assigned swim behavior.

void performFly() - Calls the assigned fly behavior.

void setSwimBehavior(SwimBehavior sb) - Allows dynamic change of swimming behavior.

void setFlyBehavior(FlyBehavior fb) - Allows dynamic change of flying behavior.

Duck Subclasses

MallardDuck - A duck that flies and swims.

RedHeadDuck - Similar to MallardDuck.

RubberDuck - Does not fly but floats.

DecoyDuck - Does not swim or fly.

WoodenDuck - Similar to DecoyDuck.

2. Interfaces and Implementations
   
SwimBehavior (Interface)

void swim()

Implementations:

Swim - Defines normal swimming behavior.

Float - Defines floating behavior.

Drown - Defines ducks that sink.

FlyBehavior (Interface)

void fly()

Implementations:

Fly - Defines normal flying behavior.

NotFly - Defines ducks that cannot fly.

5. Main Class (DuckSimulator)
Creates different types of ducks.
Assigns appropriate FlyBehavior and SwimBehavior to each duck.
Calls performSwim() and performFly() to demonstrate their behaviors.
Dynamically changes behaviors using setSwimBehavior() and setFlyBehavior().
