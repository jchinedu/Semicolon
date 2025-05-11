public class PowerTable {
    public static void main(String[] args) {
        System.out.println("a\tb\ta^b");

        for (int a = 1; a <= 5; a++) {
            int b = a + 1;
            int power = (int) Math.pow(a, b);
            System.out.println(a + "\t" + b + "\t" + power);
        }
    }
}
