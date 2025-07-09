import java.util.Scanner;

public class MatrixInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rows = 2;
        int columns = 3;

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter " + rows + " rows and " + columns + " columns:");

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print("Enter value for matrix[" + row + "][" + col + "]: ");
                matrix[row][col] = input.nextInt();
            }
        }

        System.out.println("\nThe matrix you entered is:");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println();
        }

        input.close();
    }
}
