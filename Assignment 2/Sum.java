import java.util.Scanner;
public class Sum {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("kindly insert a number  ");
	int Number1 = input.nextInt();
	System.out.print("kindly insert a  second number  ");
	int Number2 = input.nextInt();	
        int sum = Number1 * Number2;
	System.out.printf("the answer is %d", sum);
}
 }