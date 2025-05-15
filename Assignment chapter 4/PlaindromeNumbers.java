import java.util.Scanner;
public class PlaindromeNumbers {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the Number: ");
	String reverse = "";
	String num = input.nextLine();
	int length = num.length();
	for(int index = length - 1; index >= 0; index--) {
	 	reverse = reverse + num.charAt(index);
	}
	if(num.equals(reverse)) {
	  System.out.println("the entered string " + num + " is a palindrome. ");
	} else {
	   System.out.println("the entered string " + num + " isn't a palindrome.");
}
}
 }
	
	
	