package PrintDashs;

public class PrintDash {
    // variables
    // private String[] grid = new String[10];
    private int qty = 10;
    private int rows = qty;
    private int cols = qty;
    private int[][] grid = new int[rows][cols];

    // constructor

    // set

    // compute
    public void computerPrint() {
        for (int i = 0; i < rows; i++) {
            for (int x = 0; x < cols; x++) {
                PrintOutput.PrintO("-");
            }
            PrintOutput.PrintO("\n");
        }
    }

    // get

}
