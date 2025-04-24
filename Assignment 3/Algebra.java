import java.util.Scanner;
public class Algebra{
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("kindly input the values of A, B and C: ");
	double a = input.nextDouble();
	double b = input.nextDouble();
	double c = input.nextDouble();
 	double r1 = (-b + Math.sqrt((b * b) - (4*a*c)))/ (2 * a);
	double r2 = (-b - Math.sqrt((b * b) - (4*a*c)))/ (2 * a);
	double g = (b * b) - (4*a*c);
	if(g > 0) {
	System.out.printf("the equation has two roots %.6f and %.6f", r1, r2);
	}
	else{
	if(g == 0) {
	System.out.printf("the equation has one root %f", r1);
	}
	else {
	System.out.printf("the equation has no real roots");
	}
}
 }
}
	
    