import java.util.Scanner;
public class DoWhileLoop {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String continueOperation;
	do {
	     System.out.print("enter the first number: ");
	     double number1 = input.nextDouble();
	     System.out.print("enter the second number: ");
	     double number2 = input.nextDouble(); 

	      double sum = number1 + number2;
	      System.out.println("the sum of " + number1 + " and " + number2 + " is: " + sum);
	       System.out.print("do you want to perform the operation again?(yes/no):");
		continueOperation = input.next();
	} while(continueOperation.equalsIgnoreCase("yes"));
}
 }