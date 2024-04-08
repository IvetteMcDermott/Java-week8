package AverageYear;

import java.util.Scanner;

public class AverageYearApp {

    // https://www.geeksforgeeks.org/how-to-print-colored-text-in-java-console/
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static void main(String[] args) {
        // scanner
        Scanner sc = new Scanner(System.in);

        // vars
        int year = 4;
        int grades = 5;
        int[][] gradesbyyear = new int[year][grades];
        int input = 0;
        int totalAverage = 0;
        int[] average;
        String student;
        String msg;

        // object
        AverageYear AY = new AverageYear();

        // input
        System.out.println(ANSI_RED + "Welcome to our system" + ANSI_RESET + ANSI_GREEN + "\n\nPlease enter your name: "
                + ANSI_RESET);
        student = sc.nextLine();

        for (int i = 0; i < year; i++) {
            System.out.println(ANSI_GREEN + "\nYear " + (i + 1) + ANSI_RESET);
            for (int x = 0; x < grades; x++) {
                msg = "\nEnter the grade " + (x + 1);
                gradesbyyear[i][x] = AverageYearInput.Inputs(msg);
            }
        }

        // set
        AY.setGradesByYear(gradesbyyear);

        // compute
        AY.computeAveYear();

        // get
        average = AY.getAverage();
        totalAverage = AY.getTotalAve();

        // output
        // print the welcome with the name
        System.out.println(ANSI_BLUE + "\nReport with averages\nStudent: " + ANSI_RESET + ANSI_GREEN + student
                + ANSI_RESET + "\n");
        // loop the year/rows
        for (int i = 0; i < year; i++) {
            // print the year out in color
            System.out.print(ANSI_BLUE + "\nyear " + (i + 1) + "\n" + ANSI_RESET);
            // loop the grades/cols
            for (int x = 0; x < grades; x++) {
                // print out the grades of the year i
                System.out.print(gradesbyyear[i][x] + " ");
            }
            // print the average of the year
            System.out.println(ANSI_BLUE + "     Average Y." + (i + 1) + "    " + average[i] + ANSI_RESET);

        }
        // print the total average of the 4 years
        System.out.println(ANSI_GREEN + "\nThe average of the four years is :" + totalAverage + "\n" + ANSI_RESET);
    }
}