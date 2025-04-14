import java.util.Scanner;
public class TwoIntegers {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("kindly insert a number  ");
	int Number1 = input.nextInt();
	System.out.print("kindly insert a  second number  ");
	int Number2 = input.nextInt();
	int Product = Number1 * Number2;
	int sum = Number1 + Number2;
	if(Number1 > 0 && Number2 > 0) {
	System.out.printf("the answer is %d", Product);
	}
	else if (Number1 < 0 && Number2 < 0) {
	System.out.printf("the answer is %d", sum);
	}
 }
}        
