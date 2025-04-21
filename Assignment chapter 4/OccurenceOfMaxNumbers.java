import java.util.Scanner;
public class OccurenceOfMaxNumbers {
 public static void main(String[] args) {
	int max = 1;
	Scanner input = new Scanner(System.in);
	System.out.print("how many numbers will you enter? ");
	int Tnumber = input.nextInt();
	System.out.print("Enter number 1: ");
	int number = input.nextInt();
	int largest = number;
	int numbersEnterd = 2;
	while(numbersEnterd <= Tnumber) {
	System.out.print("enter number " + numbersEnterd + ": ");
	number = input.nextInt();
	numbersEnterd++;
	if(number > largest) {
	largest = number;
	max = 1;
	}else if (number == largest) {
	max++;
	}
	}
	System.out.println("the largest number is " + largest + " and it occured " + max + " times");
}
 }