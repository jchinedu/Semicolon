import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer between 0 and 1000: ");
        int number = input.nextInt();

        if (number < 0 || number > 1000) {
            System.out.println("Invalid input. Please enter a number between 0 and 1000.");
        } else {
            int sum = 0;
            int original = number;

            while (number > 0) {
                sum += number % 10;
                number = number / 10;
            }

            System.out.println("The sum of the digits in " + original + " is " + sum);
        }
    }
}
