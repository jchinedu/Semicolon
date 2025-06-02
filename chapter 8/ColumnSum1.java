public class ColumnSum1 {
    public static double sumColumn(double[][] m, int columnIndex) {
        double total = 0;
        for (int row = 0; row < m.length; row++) {
            total += m[row][columnIndex];
        }
        return total;
    }

    public static void main(String[] args) {
        double[][] matrix = {
            {1.5, 2, 3, 4},
            {5.5, 6, 7, 8},
            {9.5, 1, 3, 1}
        };

        for (int column = 0; column < matrix[0].length; column++) {
            double sum = sumColumn(matrix, column);
            System.out.println("Sum of the elements at column " + column + " is " + sum);
        }
    }
}
