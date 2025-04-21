import java.util.Scanner;
public class Comparator {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter first number: ");
	double number1 = input.nextDouble();
	System.out.print("Enter second number: ");
	double number2 = input.nextDouble();
	if(number1 == number2) {
	System.out.println("0");
	}
	else if(number1 > number2) {
	System.out.println("1");
	}
	else {
	System.out.println("-1");
	}
}
  }
