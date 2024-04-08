package AverageYear;

public class AverageYear {
    // variables
    private int year = 4;
    private int grades = 5;
    private int totalYears = 0;
    private int totalAverage = 0;
    private int total = 0;
    private int[][] gradesbyyear;
    private int[] average = new int[5];

    // constructor

    // set
    public void setGradesByYear(int[][] gradesbyyear) {
        this.gradesbyyear = gradesbyyear;
    }

    // compute
    public void computeAveYear() {
        // take a year n loop adding so can average
        // output
        // totalYears is the total of the 4 years
        totalYears = 0;
        for (int i = 0; i < year; i++) {
            // total is the total of the year initialize
            total = 0;
            // total being build witht the loop
            for (int x = 0; x < grades; x++) {
                total += gradesbyyear[i][x];
            }
            // getting the ave of the year and into the array of averages
            average[i] = (total / grades);
            // building up the total averages of the 4 years
            totalYears += average[i];
        }
        // average of the 4 years
        totalAverage = totalYears / year;
    }

    // get
    public int[][] getGradesYear() {
        return gradesbyyear;
    }

    public int[] getAverage() {
        return average;
    }

    public int getTotalAve() {
        return totalAverage;
    }

}
