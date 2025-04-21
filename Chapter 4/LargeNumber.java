import java.util.Scanner;
public class LargeNumber {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int counter = 1;
		int largest;

		System.out.printf("Enter Number %s  " ,counter);
		int number = input.nextInt();
		largest = number;
		counter++;

		while(counter <= 10) {
			System.out.printf("Enter Number %s   " ,counter);
			number = input.nextInt();
		
			if(number > largest) {
				largest = number;
			}
			counter++;
			}
			System.out.printf("the largest number is %d%n   ", largest);
}
  
   }