  import java.util.Scanner;
public class TwoLargeNumber {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int counter = 1;
		int largest;
		int secondLargest;

		System.out.printf("Enter Number1");
		int number1 = input.nextInt();
		
		System.out.printf("Enter Number2");
		int number2 = input.nextInt();
		if (number1 > number2) {
			largest = number1;
			secondLargest = number2;
		} else {
			largest = number2;
			secondLargest = number1;
		}

		for( counter = 3; counter <= 10; counter++) {
			System.out.printf("Enter number%s", counter);
                         int number = input.nextInt();

			if(number > largest) {
				secondLargest = largest;
				largest = number;
			} else if (number > secondLargest) {
				secondLargest = number;
			}
		}
		
		System.out.printf("the largest number is %d%n  ", largest);
		System.out.printf("the second largest number is %d%n  ", secondLargest);

}
  
   }