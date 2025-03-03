import ducks.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose a Duck Type:");
            System.out.println("1. Mallard Duck");
            System.out.println("2. Red Head Duck");
            System.out.println("3. Rubber Duck");
            System.out.println("4. Wooden Duck");
            System.out.println("5. Decoy Duck");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            Duck duck = null;

            switch (choice) {
                case 1:
                    duck = new MallardDuck();
                    break;
                case 2:
                    duck = new RedHeadDuck();
                    break;
                case 3:
                    duck = new RubberDuck();
                    break;
                case 4:
                    duck = new WoodenDuck();
                    break;
                case 5:
                    duck = new DecoyDuck();
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
                    continue;
            }

            duck.display();
            duck.performFly();
            duck.performSwim();
        }
    }
}
