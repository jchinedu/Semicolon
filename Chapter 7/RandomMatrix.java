public class RandomMatrix {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 4;

        int[][] matrix = new int[rows][columns];

        
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int)(Math.random() * 100);
            }
        }

       
        System.out.println("Matrix filled with random numbers:");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + "\t");
            }
            System.out.println();
        }
    }
}
