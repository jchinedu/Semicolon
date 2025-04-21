import java.util.Scanner;
public class FactorialNumbers {
   public static void main(String[] args) {
	int counter;
	int factorial = 1;
	Scanner input = new Scanner(System.in);
	System.out.print("factorial checker!! kindly enter any number: ");
	int number = input.nextInt();
	for(counter = 1; counter <= number; counter++) {
		factorial = factorial * counter;
	}
		System.out.println("The Factorial of  "+ number+" is: " + factorial);
}
 }
	 
	