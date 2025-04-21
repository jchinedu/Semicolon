import java.util.Random;
import java.util.Scanner;
public class RockPaperScissorsModification {
   public static void main(String[] args) {
	 int userWins = 0; 
  .ly68
         int computerWins = 0;
	Scanner input = new Scanner(System.in);
	Random rand = new Random();
	 while (Math.abs(computerWins - userWins) <= 2) { 
	System.out.println("Welcome to Rock, paper, and Scissor!");
	System.out.print("please choose 1 for ROCK, 2 for PAPER, or 0 for SCISSORS. > ");
	
	String userChoice = "";
	String computerChoice = "";
	userChoice = input.nextLine().toUpperCase(); 	
	int num = rand.nextInt(3);
	if(num == 0) {
	computerChoice = "0";
	}
	else if(num == 1) {
	computerChoice = "1";
	}
	else if(num == 2) {
	computerChoice = "2";
	}
	


	if(computerChoice.equals("0")) {
		System.out.println("the computer chose scissors.");
	}
	else if(computerChoice.equals("1")) {
		System.out.println("the computer chose Rock.");
	}
	else if(computerChoice.equals("2")) {
		System.out.println("the computer chose Paper .");
	}
	if(userChoice.equals("1") && computerChoice.equals("0")) {
		System.out.println("Congratulations, you won!!");
	userWins++; 
	}
	else if(userChoice.equals("2") && computerChoice.equals("1")) {
		System.out.println("Congratulations, you won!!");
	userWins++;
	}
	else if(userChoice.equals("0") && computerChoice.equals("2")) {
		System.out.println("Congratulations, you won!!");
	userWins++;
	}
	
 

	else if(userChoice.equals("0") && computerChoice.equals("1")) {
		System.out.println("THE COMPUTER WON!!");
	computerWins++;
	}
	else if(userChoice.equals("1") && computerChoice.equals("2")) {
		System.out.println("THE COMPUTER WON!!");
	computerWins++;
	}
	else if(userChoice.equals("1") && computerChoice.equals("0")) {
		System.out.println("THE COMPUTER WON!!");
	computerWins++;
	}
	
	else if(userChoice.equals(computerChoice)) {
		System.out.println("Lucky!! it is a tie");
	}
	System.out.println("Current Score: You - " + userWins + " | Computer - " + computerWins);
       }
	if (userWins > computerWins) {
           System.out.println("Congratulations! You won the game!");
       } else {
           System.out.println("The computer won the game! Better luck next time.");
       }


}
 }
