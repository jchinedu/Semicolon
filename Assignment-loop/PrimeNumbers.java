import java.util.Scanner;
public class PrimeNumbers {
  public static void main(String[] args) {
	System.out.print("Enter a number: ");
	Scanner input = new Scanner(System.in);
	int Number = input.nextInt();
	int count = 0;
	for(int i = 2; i < Number; i++) {
	   if(Number % i == 0) {
	count++;
	}
	 }	
	if(count > 0) {
	System.out.println(Number + " is not a prime number");
	} else {
	  System.out.println(Number + " is a prime number");
	}
}
  }