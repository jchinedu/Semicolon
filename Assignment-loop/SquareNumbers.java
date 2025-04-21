import java.util.Scanner; 
public class SquareNumbers {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number:  ");
	int Number1 = input.nextInt();
	System.out.print("Enter a second number: ");
	int Number2 = input.nextInt();
	int count = 1;
	int result = 1;
	while(count <= Number2 ) {
	result =result * Number1;
	count++;
	}
	System.out.println( Number1 +" raised to the power of " + Number2 + " is: " + result);
}
 }