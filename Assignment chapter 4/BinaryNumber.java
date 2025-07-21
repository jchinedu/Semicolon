import java.util.Scanner;
public class BinaryNumber {
   public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("kindly enter an integer to change to binary: ");
	int Number = input.nextInt();
	StringBuilder john = new StringBuilder();
	while(Number > 0) {
	int R = Number % 2;
	john.append(R);
	Number = Number / 2;
	}
	System.out.println(john.reverse());
} 
 } 
	