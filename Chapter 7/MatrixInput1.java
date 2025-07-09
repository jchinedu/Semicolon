import java.util.Scanner;

public class MatrixInput1 {
    public static void main(String[] args) {
        int rows = 2;
        int columns = 3;
        int[][] matrix = readMatrix(rows, columns);
        printMatrix(matrix);
    }

    public static int[][] readMatrix(int rows, int columns) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter " + rows + " rows and " + columns + " columns:");
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                System.out.print("Enter value for matrix[" + row + "][" + col + "]: ");
                matrix[row][col] = input.nextInt();
            }
        }
        input.close();
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("\nThe matrix you entered is:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}
