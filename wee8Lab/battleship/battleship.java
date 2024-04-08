package battleship;

public class battleship {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    // variables
    private int guessRow;
    private int guessCol;
    private int counter;
    private int[] userShip;
    private int[] pcShip;
    private int[][] guessUser = new int[10][2];
    private int[][] guessPC = new int[10][2];
    private String[][] grid;
    private String text;

    // constructor

    // set
    public void setPCShip(int[] pcShip) {
        this.pcShip = pcShip;
    }

    public void setUserShip(int[] userShip) {
        this.userShip = userShip;
    }

    public void setGuessRow(int guessRow) {
        this.guessRow = guessRow;
    }

    public void setGuessCol(int guessCol) {
        this.guessCol = guessCol;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void setGuessUser(int[][] guessUser) {
        this.guessUser = guessUser;
    }

    public void setGrid(String[][] grid) {
        this.grid = grid;
    }

    // compute
    public String[][] computeGrid() {
        // run through guessUser to replace what user hit with X

        for (int[] row : guessUser) {
            if (row[0] > 3 || row[0] < 1 || row[1] > 3 || row[1] < 1) {
            } else {
                grid[row[0]][row[1]] = "X";
                // cleans the corner as its the 0,0 point=default in array
                grid[0][0] = " ";
            }
        }
        return grid;

    }

    public int computeRandom() {
        // generates random number
        int randomN = (int) (Math.random() * 3 + 1);
        return randomN;
    }

    public void computeUserTurn(int guessRow, int guessCol, int counter, int[] pcShip) {

        // check if the guess for col was right
        if (guessRow == pcShip[0]) {
            // check if the guess for row was right
            if (guessCol == pcShip[1]) {
                // guess right print the artascii
                battleShipPrints.ArtUser();

                // saving them to the list of guess
                guessUser[counter][0] = guessRow;
                guessUser[counter][1] = guessCol;

                // exit the game as had win
                System.exit(0);
            } else {
                // saving them to the list of guess
                guessUser[counter][0] = guessRow;
                guessUser[counter][1] = guessCol;
                battleShipPrints.ToPrint("Not damage done!");
                // feedback if was in range
                if (guessUser[counter][0] < 1 || guessUser[counter][0] > 3 || guessUser[counter][1] < 1
                        || guessUser[counter][1] > 3) {
                    battleShipPrints.ToPrint("\nYou were out of range\n");
                }

            }
        } else {
            // saving them to the list of guess
            guessUser[counter][0] = guessRow;
            guessUser[counter][1] = guessCol;
            battleShipPrints.ToPrint("Not damage done!");
            // feedback if was in range
            if (guessUser[counter][0] < 1 || guessUser[counter][0] > 3 || guessUser[counter][1] < 1
                    || guessUser[counter][1] > 3) {
                battleShipPrints.ToPrint("\nYou were out of range\n");
            }
        }
    }

    public void computePcTurn(int counter) {
        // randoms
        guessRow = computeRandom();
        guessCol = computeRandom();

        // validation that doesnt exist in array// it is not fully running through all
        // the array but 1
        for (int[] row : guessPC) {
            while (row[0] == guessRow && row[1] == guessCol) {
                guessRow = computeRandom();
                guessCol = computeRandom();
            }
        }
        // to test: the pc guess for this turn
        // battleShipPrints.ToPrint(guessRow + " " + guessCol);
        // logic
        if (guessRow == userShip[0]) {
            guessPC[counter][0] = guessRow;
            guessPC[counter][1] = guessCol;

            battleShipPrints.ToPrint(ANSI_GREEN + "\nPc missed!\n" + ANSI_RESET);

            // check if the guess for row was right
            if (guessCol == userShip[1]) {
                guessPC[counter][0] = guessRow;
                guessPC[counter][1] = guessCol;

                // guess right print the artascii
                battleShipPrints.ArtPC();

                // exit the game as PC had win
                System.exit(0);
            }
        } else {
            // saving them to the list of guess
            guessPC[counter][0] = guessRow;
            guessPC[counter][1] = guessCol;
            battleShipPrints.ToPrint(ANSI_GREEN + "\nPc missed!\n" + ANSI_RESET);
        }
    }

    // gets
    public int[] getPcShip() {
        return pcShip;
    }

    public int[] getUserShip() {
        return userShip;
    }

    public String[][] getGrid() {
        return grid;
    }

}
