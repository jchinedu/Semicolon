import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {
   public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Random rand = new Random(); 
	System.out.println("Welcome to Rock, paper, and Scissor!");
	System.out.print("please choose 1 for ROCK, 2 for PAPER, or 0 for SCISSORS. > ");
	
	String userChoice = "";
	String computerChoice = "";
	userChoice = input.nextLine().toUpperCase();
	int num = rand.nextInt(3);
	if(num == 0) {
	computerChoice = "1";
	}
	else if(num == 1) {
	computerChoice = "2";
	}
	else if(num == 2) {
	computerChoice = "0";
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
	}
	else if(userChoice.equals("2") && computerChoice.equals("1")) {
		System.out.println("Congratulations, you won!!");
	}
	else if(userChoice.equals("0") && computerChoice.equals("2")) {
		System.out.println("Congratulations, you won!!");
	}

	else if(userChoice.equals("0") && computerChoice.equals("1")) {
		System.out.println("the computer won");
	}
	else if(userChoice.equals("1") && computerChoice.equals("2")) {
		System.out.println("Congratulations, you won!!");
	}
	else if(userChoice.equals("1") && computerChoice.equals("0")) {
		System.out.println("Congratulations, you won!!");
	}
	
	else if(userChoice.equals("0") && computerChoice.equals("0")) {
		System.out.println("Lucky!! it is a tie");
	}
	else if(userChoice.equals("2") && computerChoice.equals("2")) {
		System.out.println("Lucky!! it is a tie!");
	}
	else if(userChoice.equals("1") && computerChoice.equals("1")) {
		System.out.println("Lucky!! it is a tie");
	}





}
 }
