package battleship;

public class battleShipPrints {
    // https://www.geeksforgeeks.org/how-to-print-colored-text-in-java-console/
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static void Output(String[][] grid) {

        System.out.println(ANSI_RED + "\n\n   B A T T L E S H I P" + ANSI_RESET);
        System.out.println("\n");

        for (int i = 0; i < 4; i++) {
            for (int x = 0; x < 4; x++) {
                System.out.print("  " + grid[i][x] + "  " + "|");

            }

            System.out.println("\n-------------------------");
        }

    }

    public static void ToPrint(String text) {
        System.out.print(text);
    }

    public static void ArtUser() {
        battleShipPrints.ToPrint(
                ANSI_RED + "\n\n        _.-^^---....,,--       " + "\n" +
                        "     _--                --_ " + "\n" +
                        "    <                       >" + "\n" +
                        "     (                     ) " + "\n" +
                        "       ```--. . , ; .--'''      " + "\n" +
                        "             | |   |             " + "\n" +
                        "          .-=||  | |=-.   " + "\n" +
                        "          `-=#$%&%$#=-'   " + "\n" +
                        "             | ;  :|     " + "\n" +
                        "    _____.,-#%&$@%#&#~,._____" + "\n\n"
                        + "\n\nYou got it!!\nTheir ship had been sank!\n\n" + ANSI_RESET);
    }

    public static void ArtPC() {

        battleShipPrints.ToPrint(ANSI_BLUE + "\nPC Won!!!... Better luck next time!\n\n" + ANSI_RESET);

        battleShipPrints.ToPrint(ANSI_GREEN
                + "\\\n   /\\\\  \\\n" +
                "  /  \\¬ \\\n" +
                "  \\   \\ ______ \\\n" +
                "   \\   \\     /\\\n" +
                "    \\   \\   /\\\n" +
                "~~~~~~~~~~~~~~~~~~~~~\\"

                + ANSI_RESET);

    }
}