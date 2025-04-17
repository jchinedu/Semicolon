import java.util.Scanner;
public class HeadOrTail {
  public static void main(String[] args) {
	
	final int HEAD = 0;
	final int TAIL = 1;
	int guess = TAIL;
	String result = "";
	Scanner input = new Scanner(System.in);
	int number =(int) (Math.random() * 2);
		System.out.println("Enter your guess 0 for head and 1 for Tail: ");
		guess = input.nextInt();
		if(guess == number) {
		 result = "the guess is correct!";
		} else if(number == HEAD) {
		result = "sorry, it is a head";
		} else {
		   result = "sorry, it is a tail";
		}
		
		System.out.println(result);
}
 }