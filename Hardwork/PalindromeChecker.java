import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        while (true) {
            System.out.print("Enter a 5-digit number: ");
            num = input.nextInt();
            if (num >= 10000 && num <= 99999) break;
            System.out.println("Invalid input.");
        }
        int reversed = 0, original = num;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        System.out.println(original == reversed ? "the number is a Palindrome number" : "the number is Not a palindrome number");
    }
}
