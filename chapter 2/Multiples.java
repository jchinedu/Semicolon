import java.util.Scanner;
public class Multiples {
public static void main (String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("kindy enter an integer");
int num = input.nextInt();
System.out.print("kindy enter a second integer");
int num2 = input.nextInt();
int trippled = (num * 3);
int square = num2*2;
if(trippled == square)
System.out.printf("the result is : %d%n", square);
}
}
