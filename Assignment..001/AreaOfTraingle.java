import java.util.Scanner;
public class AreaOfTraingle {
   public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
     System.out.print("kindly enter the first points to calculate the area of a triangle: ");
      double x1 = input.nextDouble();
      double y1 = input.nextDouble();
     System.out.print("kindly enter the second points to calculate the area of a triangle: ");
      double x2 = input.nextDouble();
      double y2 = input.nextDouble();
     System.out.print("kindly enter the second points to calculate the area of a triangle: ");
      double x3 = input.nextDouble();
      double y3 = input.nextDouble();

      		 double s1 = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
                 double s2 = Math.sqrt((x3-x2)*(x3-x2) + (y3-y2)*(y3-y2));
                 double s3 = Math.sqrt((x3-x1)*(x3-x1) + (y3-y1)*(y3-y1));
                 
                 double S = (s1 + s2 + s3)/2;
  
                 double Area = Math.sqrt(S*((S-s1)*(S-s2)*(S-s3)));
                  System.out.printf("the area of the triangle is: %.2f%n", Area);
}
 }



     
