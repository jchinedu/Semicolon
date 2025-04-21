import java.util.Scanner;
public class DistanceBetweenTwoPoints {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter X-coordinates for point 1: ");
	double X1 = input.nextDouble();
	System.out.print("Enter Y-coordinates for point 1: ");
	double Y1 = input.nextDouble();
	System.out.print("Enter X-coordinates for point 2: ");
	double X2 = input.nextDouble();
	System.out.print("Enter Y-coordinates for point 2: ");
	double Y2 = input.nextDouble();
	
	if(X1 == X2) {
	   System.out.println("the points are on the same vertical line.");
	}
	else if (Y1 == Y2) {
	    System.out.println("the points are on the same horizontal line.");
	} else {
	     System.out.println("the points are not on the same line perpendicular to an axis.");
	}
}
 }