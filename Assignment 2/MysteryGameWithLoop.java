 //2. create a game called mystery game, when the app runs it will request you to guess a number, the system will be able to generate a random number between 1 and 10, if the user enter any number at all then compare with the number generated it should prompt to the user too high, too low and correct... the user has three times to try

import java.util.Scanner;
import java.util.Random;
public class MysteryGameWithLoop {
 public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Random rand = new Random();
	System.out.println("WELCOME TO MYSTERY GAME");
	System.out.print("kindly guess a number between 1 to 10: ");
	int number = input.nextInt();
	String userChoice = "";
	String computerChoice = "";
	if (number < 0 ||number > 10) {
	System.out.print("invalid input"); }	
	userChoice = input.nextLine();
	int num = rand.nextInt(10) + 1;
	computerChoice = String.valueOf(num);

        System.out.println("Computer's choice: " + computerChoice);

        if (userChoice.equals(computerChoice)) {
            System.out.println("Congratulations, you guessed right!");
        } else if (Math.abs(Integer.parseInt(userChoice) - Integer.parseInt(computerChoice)) == 1) {
            System.out.println("Sorry, so close!");
        } else if (Integer.parseInt(userChoice) > Integer.parseInt(computerChoice)) {
            System.out.println("Sorry, too high!");
        } else {
            System.out.println("Sorry, too low!");
        }

   	}
}

	







