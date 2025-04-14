import java.util.Scanner;
public class TwoTwoIntegers {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("kindly insert a number  ");
	int Number1 = input.nextInt();
	System.out.print("kindly insert a  second number  ");
	int Number2 = input.nextInt();
	int difference = Number1 - Number2;
	if(Number1 > Number2) {
	  System.out.printf("the result is %d", difference);}
	else if(Number1 < Number2) {
	}
}
 }
 