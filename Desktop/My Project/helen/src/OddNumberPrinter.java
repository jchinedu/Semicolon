public class OddNumberPrinter {
    public static void printOddNumbers(int number) {
        for (int i = 1; i <= number; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        printOddNumbers(10);
    }
}
