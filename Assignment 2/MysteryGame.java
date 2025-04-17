 //2. create a game called mystery game, when the app runs it will request you to guess a number, the system will be able to generate a random number between 1 and 10, if the user enter any number at all then compare with the number generated it should prompt to the user too high, too low and correct... the user has three times to try

import java.util.Scanner;
import java.util.Random;
public class MysteryGame {
 public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Random rand = new Random();
	System.out.println("WELCOME TO MYSTERY GAME");
	System.out.print("kindly guess a number between 1 to 10: ");
	int number = input.nextInt();
	String userChoice = "";
	String computerChoice = "";
	if (number < 0) {
	System.out.print("invalid input"); }
	if(number > 10) {
	System.out.println("invalid input");	
	userChoice = input.nextLine();
	int num = rand.nextInt(10) + 1;
	if(num == 1) {
	computerChoice = "1";
	}
	 if(num == 2) {
	computerChoice = "3";
	}
	 if(num == 3) {
	computerChoice = "4";
	}
	if(num == 4) {
	computerChoice = "5";
	}
	 if(num == 5) {
	computerChoice = "6";
	}
	 if(num == 6) {
	computerChoice = "7";
	}
	 if(num == 7) {
	computerChoice = "8";
	}
	 if(num == 8) {
	computerChoice = "9";
	}
	 if(num == 9) {
	computerChoice = "10";
	}
	 if(num == 10) {
	computerChoice = "2";
	}
	}
	 if(userChoice.equals("1") && computerChoice.equals("2")) {
		System.out.println("sorry, too low");
	}
	 if(userChoice.equals("2") && computerChoice.equals("1")) {
		System.out.println("sorry, so close");
	}
	if(userChoice.equals("3") && computerChoice.equals("4")) {
		System.out.println("sorry, so close");
	}

	if(userChoice.equals("4") && computerChoice.equals("3")) {
		System.out.println("sorry, so close");
	}
	if(userChoice.equals("5") && computerChoice.equals("6")) {
		System.out.println("sorry, so close");
	}
	if(userChoice.equals("6") && computerChoice.equals("5")) {
		System.out.println("sorry, so close");
	}
	
	if(userChoice.equals("7") && computerChoice.equals("8")) {
		System.out.println("sorry, too high");
	}
	if(userChoice.equals("8") && computerChoice.equals("7")) {
		System.out.println("sorry, too high");
	}
	if(userChoice.equals("9") && computerChoice.equals("10")) {
		System.out.println("sorry, too high");
	}
	if(userChoice.equals("10") && computerChoice.equals("9")) {
		System.out.println("sorry, too high");
	}
	
	if(userChoice.equals("1") && computerChoice.equals("1")) {
		System.out.println("congratulations, you guessed right");
	}
	 if(userChoice.equals("2") && computerChoice.equals("2")) {
		System.out.println("congratulations, you guessed right");
	
	if(userChoice.equals("3") && computerChoice.equals("3")) {
		System.out.println("congratulations, you guessed right");
	}

	 if(userChoice.equals("4") && computerChoice.equals("4")) {
		System.out.println("congratulations, you guessed right");
	}
	 if(userChoice.equals("5") && computerChoice.equals("5")) {
		System.out.println("congratulations, you guessed right");
	}
	 if(userChoice.equals("6") && computerChoice.equals("6")) {
		System.out.println("congratulations, you guessed right");
	}
	
	 if(userChoice.equals("7") && computerChoice.equals("7")) {
		System.out.println("congratulations, you guessed right");
	}
	 if(userChoice.equals("8") && computerChoice.equals("8")) {
		System.out.println("congratulations, you guessed right");
	}
	 if(userChoice.equals("9") && computerChoice.equals("9")) {
		System.out.println("congratulations, you guessed right");
	}
	 if(userChoice.equals("10") && computerChoice.equals("10")) {
		System.out.println("congratulations, you guessed right");
	}
}
}
}

	







