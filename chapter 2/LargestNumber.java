import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1;
        int number;
        int largest;

        // Prompt for the first number
        System.out.print("Enter integer #" + counter + ": ");
        number = input.nextInt();
        largest = number; // Initialize largest with the first input
        counter++;

        // Process remaining 9 numbers
        while (counter <= 10) {
            System.out.print("Enter integer #" + counter + ": ");
            number = input.nextInt();

            if (number > largest) {
                largest = number;
            }

            counter++;
        }

        System.out.println("The largest number is: " + largest);
        
        input.close();
    }
}