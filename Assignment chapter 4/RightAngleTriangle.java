import java.util.Scanner;
public class RightAngleTriangle {
  public static void main(String[] args) {	
	Scanner input = new Scanner(System.in);
	System.out.print("kindly enter a base length between 1-10: ");
	int number = input.nextInt();
	for(int index = 1; index <= number; index++) {
	for(int asterisk = 1; asterisk <= index; asterisk++) {
	System.out.print("*  ");
	}
	System.out.println();
	}
}
 }
	