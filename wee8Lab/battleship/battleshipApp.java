package battleship;

import java.util.Scanner;

public class battleshipApp {
    // color variables
    // https://www.geeksforgeeks.org/how-to-print-colored-text-in-java-console/
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public static void main(String[] args) {
        // open scanner
        Scanner sc = new Scanner(System.in);

        // variables
        int guessRow = 0;
        int guessCol = 0;
        int counter = 0;
        String msg;
        int[] userShip = new int[2];
        int[] pcShip = new int[2];
        int[][] guessUser;
        int[][] guessPC;
        String[][] grid = { { " ", "1", "2", "3" }, { "1", " ", " ", " " }, { "2", " ", " ", " " },
                { "3", " ", " ", " " } };

        // object
        battleship BS = new battleship();

        // Introduction to the game
        msg = "B A T T L E S H I P\n\n";
        battleShipPrints.ToPrint(ANSI_RED + msg + ANSI_RESET);
        msg = "Ok Here you go, you will play against the pc\nyou have 9 chances to sank them there is just one target ship\n1 spot length for each of you, the grid is just 3 x 3.\n\n";
        battleShipPrints.ToPrint(msg);

        // inputs to locate the ships
        battleShipPrints.ToPrint("Now, let's place your ship...\n");

        // user ship
        battleShipPrints.ToPrint("The column, ");
        userShip[0] = battleshipInput.UserInputs();

        battleShipPrints.ToPrint("The row, ");
        userShip[1] = battleshipInput.UserInputs();

        // pc ship
        pcShip[0] = BS.computeRandom();
        pcShip[1] = BS.computeRandom();
        // to test: prints the pc location
        // for (int i = 0; i < 2; i++) {
        // battleShipPrints.ToPrint(pcShip[i] + " ");
        // }

        // set
        BS.setGuessRow(guessRow);
        BS.setGuessCol(guessCol);
        BS.setGrid(grid);
        BS.setCounter(counter);
        BS.setPCShip(pcShip);
        BS.setUserShip(userShip);

        // use a while to take the inputs up to 10 times as the grid has 9 slots, and
        // call the compute to work it out
        counter = 0;
        while (counter < 9) {

            BS.computeGrid();
            battleShipPrints.Output(grid);
            guessRow = battleshipInput.Inputs(ANSI_GREEN + (msg = "Enter the row") + ANSI_RESET);
            guessCol = battleshipInput.Inputs(ANSI_GREEN + (msg = "Enter the col") + ANSI_RESET);

            BS.computeUserTurn(guessRow, guessCol, counter, pcShip);

            for (int i = 0; i < 5; i++) {
                battleShipPrints.ToPrint("\n.");
            }

            BS.computePcTurn(counter);

            counter++;

            battleShipPrints.ToPrint("\n-----------------------------------------------------------\n");
        }

        // get
        grid = BS.getGrid();
        pcShip = BS.getPcShip();
    }
}
