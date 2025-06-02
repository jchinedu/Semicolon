public class DiagonalSum {
    public static double sumMajorDiagonal(double[][] m) {
        double total = 0;
        for (int i = 0; i < m.length; i++) {
            total += m[i][i];
        }
        return total;
    }

    public static void main(String[] args) {
        double[][] matrix = {
            {1,2,3,4.0}, 
 	    {5,6.5,7,8},
 	    {9,10,11,12},
 	    {13,14,15,16}
        };

        double result = sumMajorDiagonal(matrix);
        System.out.println("Sum of the major diagonal is " + result);
    }
}
