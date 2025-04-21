 import java.util.Scanner;
public class FactorApp {
  public static void main(String[] args) {
	int counter = 1;
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int number = input.nextInt();
	System.out.print("The factors of " + number + " are: ");
	while(counter <= number) {
	if(number % counter == 0) {
	System.out.print(counter+ " ");
	}
	counter++;

	}
}
 }