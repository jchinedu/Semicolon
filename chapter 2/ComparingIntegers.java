import java.util.Scanner;
public class ComparingIntegers {
public static void main (String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("kindy enter an integer");
int num = input.nextInt();
int square = (num * num);
if(num > 100)
System.out.print("\n" + "your number is greater than 100");
if(num == 100)
System.out.print("\n" + "your number is equal 100");
if(num != 100)
System.out.print("\n" + "your number is not equal 100");
if(num < 100)
System.out.print("\n" + "your number is less than 100");
if(square > 100)
System.out.print("\n" + "the square of your number is greater than 100");
if(square == 100)
System.out.print("\n" + "the square of your number is equal 100");
if(square != 100)
System.out.print("\n" + "the square of your number is not equal 100");
if(square < 100)
System.out.print("\n" + "the square of your number is less than 100");
}
}

