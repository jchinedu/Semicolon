import java.util.Scanner;
public class ArithmeticSmallestLargest {
public static void main (String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("kindy enter an integer");
int num = input.nextInt();
System.out.print("kindy enter a second integer");
int num2 = input.nextInt();
System.out.print("kindy enter a third integer");
int num3 = input.nextInt();
int sum = num + num2 + num3;
System.out.printf("the sum of the number is : %d%n", sum);
double avg = sum/2;
System.out.printf("the avg of the numbers is : %f%n", avg);
if(num < num2 && num < num3)
System.out.print("\n" + "your number num is the smallest number");
if(num2 < num && num2 < num3)
System.out.print("\n" + "your number num2 is the smallest number");
if(num3 < num && num3 < num2)
System.out.print("\n" + "your number num3 is the smallest number");
if(num > num2 && num > num3)
System.out.print("\n" + "your number num is the highest number");
if(num2 > num && num2 > num3)
System.out.print("\n" + "your number num2 is the highest number");
if(num3 > num && num3 > num2)
System.out.print("\n" + "your number num3 is the highest number");
}
}



