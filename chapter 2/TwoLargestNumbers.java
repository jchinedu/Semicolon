import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int largest, secondLargest;

        // Read first number
        System.out.print("Enter integer #1: ");
        int first = input.nextInt();

        // Read second number
        System.out.print("Enter integer #2: ");
        int second = input.nextInt();

        // Initialize largest and secondLargest
        if (first > second) {
            largest = first;
            secondLargest = second;
        } else {
            largest = second;
            secondLargest = first;
        }

        // Process the remaining 8 numbers
        for (int counter = 3; counter <= 10; counter++) {
            System.out.print("Enter integer #" + counter + ": ");
            number = input.nextInt();

            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest) {
                secondLargest = number;
            }
        }

        System.out.println("The largest number is: " + largest);
        System.out.println("The second largest number is: " + secondLargest);

        input.close();
    }
}