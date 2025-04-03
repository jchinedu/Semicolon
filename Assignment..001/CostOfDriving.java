import java.util.Scanner;
public class CostOfDriving {
 public static void main(String[] args) {
  
      Scanner input = new Scanner(System.in);
        System.out.print("kindly Enter the driving distance: ");
         double D = input.nextDouble();
        System.out.print("kindly Enter the Miles per Gallon: ");
         double MPG = input.nextDouble();
        System.out.print("kindly Enter the price per Gallon: ");
         double PPG = input.nextDouble();


	 double CostOfDriving = D/MPG*(PPG);
          System.out.printf("the cost of driving is $%.2f%n ", CostOfDriving);
}
 }

