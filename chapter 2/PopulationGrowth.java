import java.util.Scanner;
public class PopulationGrowth {
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("please input the estimated world population :");
double POP = input.nextDouble();
double first = ((POP) *(85.0 / 100));
System.out.printf("the estimated world population after one year is: %f%n" , first);
double second = (POP *(85.0 / 100) * 2);
System.out.printf("the estimated world population after two years is: %f%n" , second);
double third = (POP *(85.0 / 100) * 3);
System.out.printf("the estimated world population after three years is: %f%n" , third);
double fourth = (POP *(85.0 / 100) * 4);
System.out.printf("the estimated world population after four years is: %f%n" , fourth);
double fifth =  (POP *(85.0 / 100) * 5);
System.out.printf("the estimated world population after five years is: %f%n" , fifth);
}
}
