// (Process a string) Write a program that prompts the user to enter a string and dis
//plays its length and its first character.
import java.util.Scanner;
public class ProcessString {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("kindly enter any word of your choice: ");
	String name = input.nextLine();
	int lenght = name.length();
	System.out.println("the total string entered is " + lenght);
	for(int i = lenght - 1; i > 0; i-- ) {
	    System.out.println("the first character is  " + name.charAt(i));
		break;
		}
}
 }
