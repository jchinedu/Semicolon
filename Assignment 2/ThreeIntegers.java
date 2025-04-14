import java.util.Scanner;
public class ThreeIntegers {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("kindly insert a number  ");
	int Number1 = input.nextInt();
	System.out.print("kindly insert a  second number  ");
	int Number2 = input.nextInt();
	System.out.print("kindly insert a third number  ");
	int Number3 = input.nextInt();
        if(Number2 > Number1) {
	System.out.print("TRUE");
	}
	else if(Number3 > Number2) {
	System.out.println("TRUE");
	}
 }
}	

	

