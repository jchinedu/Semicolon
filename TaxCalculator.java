import java.util.Scanner;
public class TaxCalculator {
public static void main(String[] args) {
double tax = 0;
int earning = 30000;
int i =1;
Scanner input = new Scanner(System.in);
while (i <=3) {
System.out.print("kindly insert your earnings, to calculate your tax: ");
int number = input.nextInt();
if(number > earning) {
tax = 0.2 * number;
} else {
tax = 0.15 * number;
}
System.out.printf("the calculated tax is: %.2f%n", tax);
i++;
}
}
}

