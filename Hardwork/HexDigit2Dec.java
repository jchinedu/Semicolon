import java.util.Scanner;
public class HexDigit2Dec {
 public static void main(String[] args) {
  	Scanner input = new Scanner(System.in);
   	System.out.print("enter a hex digit: ");
	String hexString = input.next();
	if(hexString.length() != 1) {
	System.out.println("you must enter exatly one character");
	System.exit(1);
	}	
	char ch = hexString.charAt(0);
	if(ch <= 'F' &&  ch >= 'A') {
	int value = ch - 'A' + 10;
	System.out.println("the decimal value for hex digit " + ch + " is " + value);
}
	else if (Character.isDigit(ch)) {
	System.out.println("the decimal value for hex digit " + ch +" is " + ch);
}
 else {
	System.out.println(ch + " is an invalid value");
}
 }
  }
   