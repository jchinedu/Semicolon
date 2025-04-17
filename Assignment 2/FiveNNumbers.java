//collect five numbers from the user and print out the largest, the smallest and the average of the even numbers
import java.util.Scanner;
public class FiveNNumbers {
	public static void main(String[] args) {
	int even = 0;
	int count = 0;
	   Scanner input = new Scanner(System.in);
	   System.out.print("enter first number");
	   int number1 = input.nextInt();
	   System.out.print("enter second number");
	   int number2 = input.nextInt();
	   System.out.print("enter third number");
	   int number3 = input.nextInt();
	   System.out.print("enter fourth number");
	   int number4 = input.nextInt();
	   System.out.print("enter fifth number");
	   int number5 = input.nextInt();
	if(number1 > number2 && number1 > number3 && number1 > number4 && number1 > number5) {
	     System.out.printf("the largest number is %d", number1);
       	}
	if(number2 > number1 && number2 > number3 && number2 > number4 && number2 > number5) {
	     System.out.printf("the largest number is %d\n", number2);
       	}
	if(number3 > number1 && number3 > number2 && number3 > number4 && number3 > number5) {
	     System.out.printf("the largest number is %d\n", number3);
       	}
	if(number4 > number1 && number4 > number2 && number4 > number3 && number4 > number5) {
	     System.out.printf("the largest number is %d\n", number4);
       	}
	if(number5 > number1 && number5 > number2 && number5 > number3 && number5 > number4) {
	     System.out.printf("the largest number is %d\n", number5);
       	}
	if(number1 < number2 && number1 < number3 && number1 < number4 && number1 < number5) {
	     System.out.printf("the lowest number is %d\n", number1);
       	}
	if(number2 < number1 && number2 < number3 && number2 < number4 && number2 < number5) {
	     System.out.printf("the lowest number is %d\n", number2);
       	}
	if(number3 < number1 && number3 < number2 && number3 < number4 && number4 < number5) {
	     System.out.printf("the lowest number is %d\n", number3);
       	}
	if(number4 < number1 && number4 < number2 && number4 < number3 && number4 < number5) {
	     System.out.printf("the lowest number is %d\n", number4);
       	}
	if(number5 < number1 && number5 < number2 && number5 < number3 && number5 < number4) {
	     System.out.printf("the lowest number is %d\n", number5);
       	}

	if(number1 % 2 == 0) {
	even = even + number1;
	count = count + 1;
	}
	if(number2 % 2 == 0) {
	even = even + number2;
	count = count + 1;
	}
	if(number3 % 2 == 0) {
	even = even + number3;
	count = count + 1;
	}
	if(number4 % 2 == 0) {
	even = even + number4;
	count = count + 1;
	}
	if(number5 % 2 == 0) {
	even = even + number5;
	count = count + 1;
	}
	int Average = even / count;
	System.out.printf("the answer of the average is %d", Average);

}
 }


	   

	   


	   