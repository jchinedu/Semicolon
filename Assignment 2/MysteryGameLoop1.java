import java.util.Random;
import java.util.Scanner;
public class MysteryGameLoop1{
  public static void main(String[] args) {
    int numb = 0;
	Scanner input = new Scanner(System.in);
	    Random rand = new Random();
	    int target = rand.nextInt(10) + 1;
	      while(true) {
		System.out.println("GUESS A NUMBER FROM 1-10: ");
		int num = input.nextInt();
		numb++;
		if(num == target) {
	  	System.out.println("CONGRATULATIONSSS, YOU WIN!!!!" + " YOU GUESSED " + numb + " TIMES ");
		break;
		} 
	 	if(num < target) {
		System.out.println("AHH!! YOU JUST GUESSED A LOW VALUE");
		}
		 else {
		System.out.println("AHH!! YOU JUST GUESSED A HIGH VALUE");
		}
		if(numb != target) {
		System.out.println("COME ON LAD, TRY AGAIN!!");
		}  		
		}
	
}  
   }
	