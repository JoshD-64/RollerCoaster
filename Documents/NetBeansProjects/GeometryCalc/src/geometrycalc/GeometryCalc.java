package geometrycalc;

//keyboard import.
import java.util.Scanner;

public class GeometryCalc {

    public static void main(String[] args) {

        //records keyboard input.
        Scanner key = new Scanner(System.in);

        //varible to hold user input.
        int input;

        do {

            //Main menu output.
            System.out.println("++ Geometry Calculator ++"
                    + "\n-----------------------"
                    + "\n1) Circle"
                    + "\n2) Rectangle"
                    + "\n3) Quit");

            //keyboard input.
            input = key.nextInt();

            //Switch statement for user input.
            switch (input) {

                case 1:

                    //varible to hold radius input.
                    double radius;

                    //to record keyboard input for radius.
                    System.out.print("Enter the RADIUS of the circle:");
                    radius = key.nextInt();

                    /*
                    calls the radius method in the Geometry class
                    sending radius as an argument.
                     */
                    Geometry.Circle(radius);

                    //warning statement.
                    if (radius <= 0) {
                        System.out.print("Cannot use negative numbers, Select again");
                    } else {
                        /*
                        returns the calculation 
                        for the circle from the Geometry class.
                         */
                        System.out.printf("Area: %.2f\n\n", Geometry.Area());

                    }
                    break;

                case 2:

                    /*
                    variables to hold length and width values.
                     */
                    double Length;
                    double Width;

                    //to record keyboaed input for length.
                    System.out.print("Enter the LENGTH of the rectangle:");
                    Length = key.nextInt();

                    //to record keyboaed input for width.
                    System.out.print("Enter the Width of the rectangle:");
                    Width = key.nextInt();

                    /*
                    calls the length and width method in the Geometry class
                    sending length and width as an arguments.
                     */
                    Geometry.Rectangle(Length, Width);

                    //warning statement.
                    if (Length <= 0 || Width <= 0) {
                        System.out.print("Cannot use negative numbers, Select again");
                    } else {

                        /*
                        returns the calculation 
                        for the rectangle from the Geometry class.
                         */
                        System.out.printf("Area: %.2f\n\n", Geometry.Area());
                    }

                    break;

                case 3:

                    //Program exit.
                    System.exit(0);
                    break;

            }

            //warning statement.
            if (input > 3 || input < 1) {
                System.out.print("Incorrect number, please enter 1 - 3.\n");
            }

        } while (input != 3);
    }

}
