import java.util.Scanner;
import javafx.geometry.point2d;

public class TestPoint2d {
 public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter point1 x-, y-coordinates: ");
	double x1 = input.nextDouble();
	double y1 = input.nextDouble();
	System.out.print("Enter point2 x-, y-coordinates: ");
	double x2 = input.nextDouble();
	double y2 = input.nextDouble();

	point2d p1 = new point2d(x1, y1);
