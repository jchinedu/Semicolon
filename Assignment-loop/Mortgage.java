import java.util.Scanner;
public class Mortgage {
 public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println ("Mortgage calculator");
	System.out.println("kindly enter your principal: ");
        double Principal = input.nextDouble();
	System.out.println("kindly enter the interest rate: ");
	double InterestRate = input.nextDouble();
	System.out.println("kindly enter the duration: ");
	int Duration = input.nextInt();
	double NewDuration = Duration * 12;
	double NewRate = (InterestRate / 1200);
	double Numerator =NewRate * Math.pow ((1 + NewRate) , (NewDuration)) * Principal;
	double Denominator = (Math.pow((1 + NewRate), (NewDuration)) -1);
	double MonthlyPayment =(Numerator / Denominator);
	System.out.printf(" your monthly payment is %.2f$: ", MonthlyPayment); 
}
 }
 