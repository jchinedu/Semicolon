public class MaxRowSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 5, 3},
            {7, 2, 4},
            {6, 9, 1}
        };

        int maxRow = 0;
        int indexOfMaxRow = 0;

        for (int column = 0; column < matrix[0].length; column++) {
            maxRow += matrix[0][column];
        }

        for (int row = 1; row < matrix.length; row++) {
            int totalOfThisRow = 0;
            for (int column = 0; column < matrix[row].length; column++) {
                totalOfThisRow += matrix[row][column];
            }
            if (totalOfThisRow > maxRow) {
                maxRow = totalOfThisRow;
                indexOfMaxRow = row;
            }
        }

        System.out.println("Row " + indexOfMaxRow + " has the maximum sum of " + maxRow);
    }
}
