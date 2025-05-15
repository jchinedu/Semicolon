public class MultiplicationTable {

    public static void printMultiplicationTable(int a, int b) {
        if (a > b) {
            int num = a;
            a = b;
            b = num;
        }

        String title = "Multiplication Table from " + a + " to " + b;
        int width = 5 * (b - a + 1) + 6;
        System.out.println(title);
        System.out.println();

        System.out.print("     ");
        for (int col = a; col <= b; col++) {
            System.out.printf("%5d", col);
        }
        System.out.println();

        System.out.print("     ");
        for (int col = a; col <= b; col++) {
            System.out.print("-----");
        }
        System.out.println();

        for (int row = a; row <= b; row++) {
            System.out.printf("%3d |", row);
            for (int col = a; col <= b; col++) {
                System.out.printf("%5d", row * col);
            }
            System.out.println();
        }
 }

   
