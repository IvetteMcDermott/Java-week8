package grid3x3;

public class grid3x3App {
    // color variables
    // https://www.geeksforgeeks.org/how-to-print-colored-text-in-java-console/
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public static void main(String[] args) {
        // variables
        int total = 0;
        int[] tc = new int[3];
        int[] tr = new int[3];
        int[][] grid = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        // object
        grid3x3 G = new grid3x3();

        // input

        // set
        G.setGrid(grid);
        G.setTc(tc);
        G.setTr(tr);
        G.setTotal(total);

        // compute
        G.computeGrid();

        // get
        grid = G.getGrid();
        tc = G.getTc();
        tr = G.getTr();
        total = G.getTotal();

        // output
        System.out.println("\n");

        for (int i = 0; i < 3; i++) {
            for (int x = 0; x < 3; x++) {
                System.out.print("  " + grid[i][x] + "  " + "|");
            }
            // System.out.println("\n");
            System.out.print(ANSI_RED + "   " + tr[i] + " " + ANSI_RESET);

            System.out.println("\n-------------------------");
        }
        for (int z = 0; z < 3; z++) {
            System.out.print(ANSI_RED + "  " + tc[z] + " " + "|" + ANSI_RESET);
        }

        System.out.println(ANSI_GREEN + "\n\nTotal grid " + total + "\n" + ANSI_RESET);
    }
}
