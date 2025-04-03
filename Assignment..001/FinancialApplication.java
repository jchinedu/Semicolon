import java.util.Scanner;
public class FinancialApplication {
 public static void main(String[] args) {
  
      Scanner input = new Scanner(System.in);
        System.out.print("kindly Enter your Balance and Interest rate: ");
         double B = input.nextDouble();
         double I = input.nextDouble();

         double INTEREST = B * (I/1200);
           System.out.printf("your calculated interest for the next month is: %f%n", INTEREST);
}
 }
        
