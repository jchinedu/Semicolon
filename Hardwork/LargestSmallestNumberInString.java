import java.util.Scanner;

public class LargestSmallestNumberInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string of numbers separated by spaces: ");
        String str = scanner.nextLine();
        
        // Handle edge case: if the input string is empty
        if (str.isEmpty()) {
            System.out.println("No valid numbers entered!");
            return;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // To store the current number being processed as a string
        String currentNumber = "";
        
        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // If the character is a digit, append it to the current number
            if (Character.isDigit(ch)) {
                currentNumber += ch;
            } 
            // When we encounter a space, we have a complete number
            else if (ch == ' ' && !currentNumber.isEmpty()) {
                int num = Integer.parseInt(currentNumber); // Convert to integer
                // Update min and max values
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
                currentNumber = ""; // Reset for the next number
            }
        }

        // At the end of the string, we might have one last number to process
        if (!currentNumber.isEmpty()) {
            int num = Integer.parseInt(currentNumber); // Convert to integer
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        // Output the results
        if (min == Integer.MAX_VALUE || max == Integer.MIN_VALUE) {
            System.out.println("No valid numbers entered!");
        } else {
            System.out.println("Max number: " + max);
            System.out.println("Min number: " + min);
        }

        scanner.close(); // Close the scanner
    }
}
