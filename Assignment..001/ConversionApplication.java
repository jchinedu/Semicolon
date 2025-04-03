import java.util.Scanner;
public class ConversionApplication {
 public static void main(String[] args) {
  
      Scanner input = new Scanner(System.in);
        System.out.print("kindly Enter Any number in Pounds: ");
         double Pounds = input.nextDouble();
         
             double KG = (Pounds * 0.454);
              System.out.printf("%.1f pounds is %.3f kilograms%n",Pounds,KG);
}
 }       
	

