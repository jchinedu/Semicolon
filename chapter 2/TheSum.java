import java.util.Scanner;
public class TheSum {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print(" insert a number");
int number1 = input.nextInt();
System.out.print(" insert a number");
int number2 = input.nextInt();	
if(number1 % 2 == 0 && number2 % 2 == 0) {
int sum = number1 + number2;
System.out.print("even number" + sum);
}else
  System.out.print("error");
}
}