 import java.util.Scanner;
public class AccelerationCalculation {
      public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	  System.out.print("Kindly Enter The Starting Velocity V in Meter Per Seconds: ");
	   double V = input.nextDouble();
          System.out.print("Kindly Enter The Ending Velocity V1 in Meter Per Second: ");
	   double V1 = input.nextDouble();
	  System.out.print("Kindly Enter the Time Taken in Seconds: ");
	   double T = input.nextDouble();

        double Acceleration = (V1 - V) / T;
          System.out.printf("The Calculated Acceleration in Meter Per Seconds square is : %f%n", Acceleration);
}
 } 