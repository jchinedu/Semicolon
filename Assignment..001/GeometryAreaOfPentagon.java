import java.util.Scanner;
 public class GeometryAreaOfPentagon {
  public static void main(String[] args) {
   
   Scanner input = new Scanner(System.in);
   System.out.print(" kindly enter the length from the center of a pentagon to a vertex r: ");
        double r = input.nextDouble();
double s = 2 * r * Math.sin(Math.PI / 5) ;
double Area = (5 * s * s)/(4 * Math.tan(Math.PI / 5));
     System.out.printf("the Area of the pentagon is %.2f ", Area);
}
}
