import java.util.Scanner;
public class FactorialC  {
   public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("kindly enter the number of terms you want to calculate: ");
	int number = input.nextInt();
	double e = 1.0;
	for(int i = 1; i<= number; i++) {
	e += 1.0 / factorial(i);
	}
	System.out.printf("Estimated value of e using %d terms is: %.10f%n", number, e);
	}
	public static long factorial(int n) {
	   long fact = 1;
	   for(int i = 2; i <= n; i++){
		fact *= i;
	}
	return fact;
}
  }
	