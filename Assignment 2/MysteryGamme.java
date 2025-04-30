import java.util.Random;
import java.util.Scanner;
public class MysteryGamme {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Random rand = new Random();
	int randomNumber = rand.nextInt(10) + 1;
	int num = 0;
	System.out.println("input a number from 1-10");
	 num = input.nextInt();
	if(num == randomNumber) {
	  System.out.println("this is a match");
	} else {
	 if(num < randomNumber) {
		System.out.println("this is low");
	}
	if(num > randomNumber) {
		System.out.println("this is too high");
	}
         
	
	System.out.println("input a number from 1-10");
	 num = input.nextInt();
	if(num == randomNumber) {
	  System.out.println("this is a match");
	} else {
	 if(num < randomNumber) {
		System.out.println("this is low");
	}
	if(num > randomNumber) {
		System.out.println("this is too high");
	}
	
	
	System.out.println("input a number from 1-10");
	 num = input.nextInt();
	if(num == randomNumber) {
	  System.out.println("this is a match");
	} else {
	 if(num < randomNumber) {
		System.out.println("this is low");
	}
	if(num > randomNumber) {
		System.out.println("this is too high");
	}
	 }
	}
	}
	
}  
   }
	