import java.util.Random;
import java.util.Scanner;
public class MysteryGameLoop{
  public static void main(String[] args) {
    int numb = 0;
	Scanner input = new Scanner(System.in);
	    Random rand = new Random();
	    int target = rand.nextInt(10) + 1;
	      while(numb < 3) {
		System.out.println("GUESS A NUMBER FROM 1-10: ");
		int num = input.nextInt();
		if(num == target) {
	  	System.out.println("CONGRATULATIONSSS, YOU WIN!!!!");
		break;
		} 
	 	if(num < target) {
		System.out.println("AHH!! YOU JUST GUESSED A LOW VALUE");
		}
		 else {
		System.out.println("AHH!! YOU JUST GUESSED A HIGH VALUE");
		}
		numb++;
		if(numb < 3) {   
		System.out.println("COME ON LAD, TRY AGAIN!!");
		} 
		if(numb == 3) {
        	 System.out.println("GAME OVER! THE CORRECT NUMBER WAS: " + target);
	
		}
		}
	
}  
   }
	