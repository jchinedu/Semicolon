//1. you asked the user for a number between 1 N 10 when the user gives you a number then you print out the number in words....
//2. create a game called mystery game, when the app runs it will request you to guess a number, the system will be able to generate a random number between 1 and 10, if the user enter any number at all then compare with the number generated it should prompt to the user too high, too low and correct... the user has three times to try


import java.util.Scanner;
public class RandomNumbers {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Kindly enter a number between 1 and 10: ");
	double number = input.nextDouble();
	if(number < 1) {
	   System.out.print("Sorry kindly enter a number between 1 to 10");
	   return,
	}
	 if(number > 10) {
	   System.out.print("sorry kindly enter a number between 1 to 10");
	  return;
	}
	 if(number ==1) {
		System.out.print("the number entered is ONE");
	
	         }
	else if(number == 2) {
		System.out.print("the number entered is TWO");
	    }
	
	if(number == 3) {
		System.out.print("the number entered is THREE");
	
		}
	else if(number == 4) {
		System.out.print("the number entered is FOUR");
	
	         }
	if(number ==5) {
		System.out.print("the number entered is FIVE");
	
		}
	else if(number ==6) {
		System.out.print("the number entered is SIX");
		}
	
	if(number ==7) {
		System.out.print("the number entered is SEVEN");
		}
	
	else if (number == 8) {
		System.out.print("the number entered is EIGHT");
		}
	
 	if(number == 9) {
		System.out.print("the number entered is NINE");
		}
	
	else if(number == 10) {
		System.out.print("the number entered is TEN");
	
	
	}
}
}

		
		
			
		
		
			
		
		