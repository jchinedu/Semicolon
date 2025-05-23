import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any digit number: ");
        int number = input.nextInt();
        int sum = 0;

        for (; number != 0; ) {
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }

        System.out.println("The sum of the digits is: " + sum);
    }
}
