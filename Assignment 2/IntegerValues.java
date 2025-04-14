import java.util.Scanner;
public class IntegerValues {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("kindly insert a number  ");
	int Number1 = input.nextInt();
	System.out.print("kindly insert a  second number  ");
	int Number2 = input.nextInt();	
	if(Number1 > Number2) {
		System.out.printf("the answer is %d", Number1);
		}
	if (Number1 < Number2) {
		System.out.printf("the answer is %d", Number2);
		}
	else if(Number1 == Number2) {
		System.out.printf("the answer is 0\n");
		
	if(Number1 % 6 == 0) {
		System.out.printf("the lowest value is %d", Number1);
		}
	else if(Number1 % 6 != 0) {
		System.out.printf("the highest value is %d", Number1);
		
	if(Number2 % 6 == 0) {
		System.out.printf("\nthe lowest value is %d", Number2);
		}
	if(Number2 % 6 != 0) {
		System.out.printf("the highest value is %d", Number2);
		}
}		}
 }
}