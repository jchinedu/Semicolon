import java.util.Random;
import java.util.Scanner;
public class Game{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Random rand = new Random();
	int target = rand.nextInt(10) + 1;
	System.out.print("input a number from 1-10: ");
	int num = input.nextInt();
	if(num == target) {
	  System.out.println("this is a match");
	} else {
	 if(num < target) {
		System.out.println("this is low");
	}
	if(num > target) {
		System.out.println("this is too high");
	}
         
	
	System.out.print("sorry, second try input a number from 1-10: ");
	num = input.nextInt();
	if(num == target) {
	  System.out.println("this is a match");
	} else {
	 if(num < target) {
		System.out.println("this is low");
	}
	if(num > target) {
		System.out.println("this is too high");
	}
	
	
	System.out.print("last try input a number from 1-10: ");
	num = input.nextInt();
	if(num == target) {
	  System.out.println("this is a match");
	} else {
	 if(num < target) {
		System.out.println("this is low");
	}
	if(num > target) {
		System.out.println("this is too high");
	}
		System.out.println("Game over! The correct number was: " + target);
	 }
	}
	}
	
}  
   }
	