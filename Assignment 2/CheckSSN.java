import java.util.Scanner;
public class CheckSSN  {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("kindly enter your social security number in the (format DDD-DD-DDDD): ");
	String Number = input.next();
        String number2 = "232-23-5435";
	if(Number.equals(number2)) {
	System.out.printf("%s is a valid social security number", Number);
	}
	else {
		System.out.printf("%s is an invalid social security number", number2);
	}
}
 }
