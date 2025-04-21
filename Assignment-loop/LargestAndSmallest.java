import java.util.Scanner;
public class LargestAndSmallest {
   public static void main(String[] args) {
	int largest = 0;
	int smallest = 0;
	int counter = 0;
	Scanner input = new Scanner(System.in);
	while(true) {
	System.out.print("enter integers or zero to quit: ");
	int number = input.nextInt();
	if(number == 0) {
	break;
	}
	if(counter == 0) {
	 largest = number;
	 smallest = number;
	}
	if(number > largest) {
	  largest = number;
	}
	if(number < smallest) {
	  smallest = number;
	}

	counter++;
	
	}
	if(counter == 0) {
	System.out.println("no numbers entered");
	}
	else {
	
		System.out.println("the largest number is "+ largest+"  and smallest number in the group is " +smallest);
		}
}
 }
	
	