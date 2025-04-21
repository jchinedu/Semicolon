import java.util.Scanner;
public class SpecifiedSum {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int counter = 1;
	int sum = 0;
	System.out.print("kindly insert a number: ");
	int number1 = input.nextInt();
	while(true) {
	System.out.print("kindly insert a number: ");
	int number2 = input.nextInt();
	sum += number2;
	if(sum >= number1) {
	System.out.print(sum);
	break;
	}
	counter++;
	}
}
 }
	
	