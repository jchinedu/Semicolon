import java.util.Scanner;
public class comparison {
public static void main (String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("input first integer");
int num1 = input.nextInt();
System.out.print("input second integer");
int num2 = input.nextInt();
if(num1 == num2)
System.out.printf("%d == %d%n", num1, num2);
if(num1 != num2)
System.out.printf("%d != %d%n", num1, num2);
if(num1 > num2)
System.out.printf("%d > %d%n", num1, num2);
if(num1 < num2)
System.out.printf("%d < %d%n", num1, num2);
if(num1 >= num2)
System.out.printf("%d >= %d%n", num1, num2);
if(num1 <= num2)
System.out.printf("%d <= %d%n", num1, num2);
}
}

