import java.util.Scanner;
public class GreatCircle {
    public static void main(String[] args) {
     

       Scanner input = new Scanner(System.in);
         System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
            double X1 = input.nextDouble(); 
            double Y1 = input.nextDouble();
         System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
            double X2 = input.nextDouble(); 
            double Y2 = input.nextDouble();

              double radian1  = X1 * (Math.PI / 180);
              double radian2  = X2 * (Math.PI / 180);
              double radian3  = Y1 * (Math.PI / 180);
              double radian4  = Y2 * (Math.PI / 180);

       double d = 6371.01 * Math.acos(Math.sin(radian1) * Math.sin(radian2) + Math.cos(radian1) * Math.cos(radian2) * Math.cos(radian3 - radian4));
      System.out.printf("the distance between the two points is %f%n", d);
} 
 }

  
 
       