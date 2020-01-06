package rollercoaster;

import java.util.Scanner;

public class RollerCoaster {

    public static void main(String[] args) {

        //Number of riders.
        int riders;

        //Call to the Scanner.
        Scanner key = new Scanner(System.in);

        //Ask user to enter number of riders.
        System.out.print("How many riders? ");
        riders = key.nextInt();

        //Create a Guest object.
        Guest guest = new Guest(riders);

        //Create a Roller Coaster object.
        rollCoaster coaster = new rollCoaster(guest);

        //Output the information.
        System.out.println(coaster);
    }

}
