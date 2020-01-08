package lazysecuritysystem;

import java.util.Scanner;

public class lazySystem {

    String input;
    Scanner key = new Scanner(System.in);

    public lazySystem() {

    }

    public void setActivate() {

        System.out.println("System Activation"
                + "\n==================");
        System.out.println("I really dont feel like it. (enter now to continue)");
        input = key.nextLine();

        if (input.equalsIgnoreCase("now")) {
            System.out.println("Can you get someone else do it. (enter now to continue)");
            input = key.nextLine();

            if (input.equalsIgnoreCase("now")) {
                System.out.println("I am very happy not doing anything. (enter now to continue)");
                input = key.nextLine();

                if (input.equalsIgnoreCase("now")) {
                    System.out.println("Ok, ok, Im turning it ON, sheesh");
                    System.out.println("\nSystem: ACTIVATED");
                }

            }
        }

    }

    public void setDeactivate() {

        System.out.println("System Deactivation"
                + "\n====================");
        System.out.println("Is it on? (enter yes to continue)");
        input = key.nextLine();

        if (input.equalsIgnoreCase("yes")) {
            System.out.println("Do I really have to deactivate it? (enter yes to continue)");
            input = key.nextLine();

            if (input.equalsIgnoreCase("yes")) {
                System.out.println("Are you serious? (enter yes to continue)");
                input = key.nextLine();

                if (input.equalsIgnoreCase("yes")) {
                    System.out.println("Ok, ok, Im turning it OFF");
                    System.out.println("\nSystem: DEACTIVATED");
                }

            }
        }
    }

    public String getSystem() {
        return input;
    }

}
