import java.util.Scanner;
public class Maths {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("kindly insert a number  ");
	int Number1 = input.nextInt();
	System.out.print("kindly insert a  second number  ");
	int Number2 = input.nextInt();	
        int product = Number1 * Number2;
	double sum = Number1 + Number2;
	double average = sum / 2; 
	int distance = Number1 - Number2;
	System.out.printf("the answer of their product is %d\n", product);
	System.out.printf("the answer of their sum is %.2f\n", sum);
	System.out.printf("the answer of their average is %.2f\n", average);
	System.out.printf("the answer of their distance is %d\n", distance);
	
	if(Number1 > Number2) {
		System.out.printf("the max integer is %d\n", Number1);
		System.out.printf("the min integer is %d\n", Number2);

	} else {
		System.out.printf("the max integer is %d\n", Number2);
		System.out.printf("the min integer is %d\n", Number1);
	}

}
 }