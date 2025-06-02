public class ColumnSum {
public static double sumColumn(double[][] m, int columnIndex) {
        double total = 0;
        for (int row = 0; row < m.length; row++) {
            total += m[row][columnIndex];
        }
        return total;
    }

    public static void main(String[] args) {
        double[][] matrix = {
            {1.5, 2.5, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.5, 9.0}
        };

        int columnToSum = 1;
        double result = sumColumn(matrix, columnToSum);
        System.out.println("Sum of column " + columnToSum + " is " + result);
    }
}
