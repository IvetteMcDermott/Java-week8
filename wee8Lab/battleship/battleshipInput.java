package battleship;

import java.util.Scanner;

public class battleshipInput {

    public static int Inputs(String msg) {
        // var
        int input;

        // open scanner
        Scanner sc = new Scanner(System.in);

        // input
        // need to work on validation here
        System.out.println(msg);
        input = sc.nextInt();
        return input;

    }

    public static int UserInputs() {
        // var
        int inpUser = 0;
        ;

        // open scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number from 1 to 3");
        inpUser = sc.nextInt();
        while (inpUser < 1 || inpUser > 3) {
            System.out.println("enter a number from 1 to 3");
            inpUser = sc.nextInt();
        }

        return inpUser;
    }
}
