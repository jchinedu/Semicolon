import java.util.Scanner;
public class AreaOfShape {
public static void main (String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("input a number as radius");
int r = input.nextInt();
int diameter = 2 * r;
System.out.printf("the answer of R is : %d%n", diameter);
double p = 3.14159;
double circum = p * r * 2;
System.out.printf("the answer of D is : %.2f%n", circum);
double Area = p * r * r;
System.out.printf("the answer of area is : %.2f%n", Area);
}
}