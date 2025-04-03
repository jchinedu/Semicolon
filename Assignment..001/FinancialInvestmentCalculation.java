 import java.util.Scanner;
public class FinancialInvestmentCalculation {
 public static void main(String[] args) {
  
      Scanner input = new Scanner(System.in);
        System.out.print("kindly Enter investment amount: ");
         double Amount = input.nextDouble();
        System.out.print("kindly Enter Annual Interest Rate in percentage: ");
         double Interest = input.nextDouble();
        System.out.print("kindly Enter number of years: ");
         double Years = input.nextDouble();

        double MonthlyInterest = Interest/(12*100);
        double FutureInvestmentValue = Amount * Math.pow((1 + MonthlyInterest),(Years*12));
         System.out.printf("the accumulated value is $%.2f%n", FutureInvestmentValue);
}
 } 

