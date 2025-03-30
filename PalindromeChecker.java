import java.util.Scanner;
public class PalindromeChecker {
public static void main (String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("please insert 3 digit number to check if it is palidrom numbers or not: ");
int Number = input.nextInt();
if(Number < 100 ){
System.out.print("yes! you entered three digit number: ");}
if(Number > 999 ){
System.out.print("No! you enterd a number that is not 3 digits, try again: ");}
int Answer1 = Number % 10;
int g = Number / 10; 
int Answer2 = g % 10;
int k = g / 10;
int Answer3 = k % 10;
System.out.println(Answer1 + " " + Answer2 + " " + Answer3 );
if(Answer1 == Answer3){
System.out.print("congratulations it is a palindrome number: ");
} else {
System.out.print(" this number is not a palindrome number: ");

}
}
}

