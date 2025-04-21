import java.util.Scanner;
public class FactorialB {
   public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int counter = 0;
	double answer = 0;

	System.out.print("Enter number of terms: ");
	int number = input.nextInt();

	while(counter < number) {
	    double factorial = 1;
	    int factcounter = counter;
	while(factcounter > 1) {
	factorial = factcounter * factorial;
	factcounter--;
	  }
	    answer += 1 / factorial;
	      counter++;
	   }
	
	   System.out.printf("e = %f%n", answer);
}
 }