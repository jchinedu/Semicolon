import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {
   public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Random rand = new Random(); 
	System.out.println("Welcome to Rock, paper, and Scissor!");
	System.out.print("please choose R for ROCK, P for PAPER, or S for SCISSORS. > ");
	
	String userChoice = "";
	String computerChoice = "";
	userChoice = input.nextLine().toUpperCase();
	int num = rand.nextInt(3);
	if(num == 0) {
	computerChoice = "R";
	}
	else if(num == 1) {
	computerChoice = "P";
	}
	else if(num == 2) {
	computerChoice = "S";
	}


	if(computerChoice.equals("S")) {
		System.out.println("the computer chose scissors.");
	}
	else if(computerChoice.equals("R")) {
		System.out.println("the computer chose Rock.");
	}
	else if(computerChoice.equals("P")) {
		System.out.println("the computer chose Paper .");
	}
	if(userChoice.equals("R") && computerChoice.equals("S")) {
		System.out.println("Congratulations, you won!!");
	}
	else if(userChoice.equals("P") && computerChoice.equals("R")) {
		System.out.println("Congratulations, you won!!");
	}
	else if(userChoice.equals("S") && computerChoice.equals("P")) {
		System.out.println("Congratulations, you won!!");
	}

	else if(userChoice.equals("S") && computerChoice.equals("R")) {
		System.out.println("the computer won");
	}
	else if(userChoice.equals("R") && computerChoice.equals("P")) {
		System.out.println("Congratulations, you won!!");
	}
	else if(userChoice.equals("R") && computerChoice.equals("S")) {
		System.out.println("Congratulations, you won!!");
	}
	
	else if(userChoice.equals("S") && computerChoice.equals("S")) {
		System.out.println("Lucky!! it is a tie");
	}
	else if(userChoice.equals("P") && computerChoice.equals("P")) {
		System.out.println("Lucky!! it is a tie!");
	}
	else if(userChoice.equals("R") && computerChoice.equals("R")) {
		System.out.println("Lucky!! it is a tie");
	}





}
 }
