package grid3x3;

public class grid3x3 {

    // variables
    private int total;
    private int[] tc;
    private int[] tr;
    private int[][] grid;

    // constructor

    // set
    public void setGrid(int[][] grid) {
        this.grid = grid;
    }

    public void setTc(int[] tc) {
        this.tc = tc;
    }

    public void setTr(int[] tr) {
        this.tr = tr;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    // compute
    public void computeGrid() {
        // interacting and putting the values of the grid in the totals for cols and
        // rows arrays
        for (int i = 0; i < 3; i++) {
            for (int x = 0; x < 3; x++) {
                tr[i] += grid[i][x];
                tc[i] += grid[x][i];
            }
        }

        // getting the total of grid
        total = 0;
        for (int x = 0; x < 3; x++) {
            total += tr[x];
        }
    }

    // gets
    public int[][] getGrid() {
        return grid;
    }

    public int[] getTc() {
        return tc;
    }

    public int[] getTr() {
        return tr;
    }

    public int getTotal() {
        return total;
    }
}

// Create a 3x3 array and put set values into the array.
// 1. Sum each row
// 2. Sum each column
// 3. Sum the entire array