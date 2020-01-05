package lazysecuritysystem;

import java.util.Scanner;

public class LazySecuritySystem {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int user;
        lazySystem lazy = new lazySystem();

        System.out.print("Security System Menu"
                + "\n+++++++++++++++++++++++++"
                + "\n1) Activate"
                + "\n2) Deactivate"
                + "\n3) Exit"
                + "\nuser: ");
        user = key.nextInt();

        while (user > 3 || user < 1) {
            System.out.println("must enter a number 1 - 3");
            user = key.nextInt();
        }

        if (user == 1) {
            lazy.setActivate();
        } else if (user == 2) {
            lazy.setDeactivate();
        } else if (user == 3) {
            System.exit(0);

        }
        System.out.print("");
    }

}
