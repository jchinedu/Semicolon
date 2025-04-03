 import java.util.Scanner;
public class ConvertFeetIntoMeters {
 public static void main(String[] args) {
  
      Scanner input = new Scanner(System.in);
        System.out.print("kindly Enter a value in feet: ");
         double F = input.nextDouble();
        

	 double M = F * 0.305;
         System.out.printf("%.1f feet is %.4f meters%n", F,M);
}
 }