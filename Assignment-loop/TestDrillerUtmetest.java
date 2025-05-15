import java.util.Scanner; 
public class TestDrillerUtmetest {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("kindly enter the number of copies you want to order:  ");
	int number = input.nextInt();
//System.out.println("the total amount you have to pay for these copies entered is: ");
System.out.printf("the total amount you have to pay for these copies entered is $%d",TestDrillerUtme.testdriller(number));
}
 }

	