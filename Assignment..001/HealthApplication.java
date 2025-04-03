import java.util.Scanner;
public class HealthApplication {
 public static void main(String[] args) {
  
      Scanner input = new Scanner(System.in);
        System.out.print("kindly Enter weight in pounds: ");
         double W = input.nextDouble();
        System.out.print("kindly Enter Height in inches: ");
         double H = input.nextDouble();
        

         double WEIGHT = W * 0.45359237;
         double HEIGHT = H * 0.0254;
         double BMI = WEIGHT /( HEIGHT * HEIGHT);
           System.out.printf("the body mass index in Kilogram per meter square is: %.2f%n", BMI);
}
 }

      