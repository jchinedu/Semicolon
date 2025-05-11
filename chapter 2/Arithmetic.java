import java.util.Scanner;
public class Arithmetic {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("kindly enter a whole number");
int number1 = input.nextInt();
System.out.print("kindly enter another whole number");
int number2 = input.nextInt();
int square1 = (number1 * number1);
System.out.printf("the square of number1 is : %d%n", square1);
int square2 = (number2 * number2);
System.out.printf("the square of number2 is : %d%n", square2);
int sum = square1 + square2;
System.out.printf("the sum of their squares is : %d%n", sum);
int difference = (square1 - square2);
System.out.printf("their diff is : %d%n", difference);
}
}
