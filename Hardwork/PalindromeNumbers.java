import java.util.Scanner;
public class PalindromeNumbers {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("kindly enter three digit numbers: ");
	int Number = input.nextInt();
	int number1 = Number;
	if(Number < 99 && Number < 0) {
	System.out.print("invalid input, kindly insert three numbers");
	}
	int FirstNumber = number1 % 10;
	int newnumber = number1 / 10;
	int SecondNumber = newnumber % 10;
	int newnumber1 = newnumber / 10;
	int thirdnumber = newnumber1 % 10; 
	if(thirdnumber == FirstNumber) {
	System.out.print("this is a palindrome number");
	}
	else {
	System.out.print("this is not a palindrom number");
	}
}
 }