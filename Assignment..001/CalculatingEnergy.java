import java.util.Scanner;
public class CalculatingEnergy {
 public static void main(String[] args) {
  
      Scanner input = new Scanner(System.in);
        System.out.print("kindly Enter the amount of water in kilograms: ");
         double w = input.nextDouble();
        System.out.print("kindly Enter the initial temperature: ");
         double T1 = input.nextDouble();
        System.out.print("kindly Enter the final temperature: ");
         double T2 = input.nextDouble();
        
         double Quantity = w * (T2 - T1) * 4184;
          System.out.printf("the energy needed is :%.1f%n", Quantity);
}
 }


