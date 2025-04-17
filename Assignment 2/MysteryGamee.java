import java.util.Scanner;
public class MysteryGamee {
  public static void main(String[] args) {
	
	int secretNumber = (int)(Math.random() * 10) + 1;         
	System.out.println("Guess the mystery number between 1 and 10!");

        while (guess != secretNumber) {
            System.out.print("Enter your guess: ");
           int guess = input.nextInt();

            if (guess == secretNumber) {
                System.out.println("Correct! You guessed the mystery number!");
            } else {
                System.out.println(" Wrong guess. Try again!");
		}
	}
          
        
}
 }