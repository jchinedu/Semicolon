public class ColumnSumExample {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int column = 0; column < matrix[0].length; column++) {
            int total = 0;
            for (int row = 0; row < matrix.length; row++) {
                total += matrix[row][column];
            }
            System.out.println("Sum for column " + column + " is " + total);
        }
    }
}
