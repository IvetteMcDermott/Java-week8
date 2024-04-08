package AverageYear;

import java.util.Scanner;

public class AverageYearInput {

    public static int Inputs(String msg) {
        // var
        int input;
        // String msg = "";

        // open scanner
        Scanner sc = new Scanner(System.in);

        // input
        // need to work on validation here
        System.out.println(msg);
        input = sc.nextInt();

        return input;
    }

}
