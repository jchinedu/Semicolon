public class ShuffleMatrix {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 4;
        int[][] matrix = new int[rows][columns];

        int value = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = value++;
            }
        }

        System.out.println("Original matrix:");
        printMatrix(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int i1 = (int)(Math.random() * matrix.length);
                int j1 = (int)(Math.random() * matrix[i].length);

                int temp = matrix[i][j];
                matrix[i][j] = matrix[i1][j1];
                matrix[i1][j1] = temp;
            }
        }

        System.out.println("\nShuffled matrix:");
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }
}
