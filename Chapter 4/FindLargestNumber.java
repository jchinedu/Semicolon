import java.util.Scanner; 
public class FindLargestNumber {
public static void main(String[] args) {
int largestNumber = Integer.MIN_VALUE;
int mostRecentInput = 0;
int counter = 1;
Scanner input = new Scanner(System.in);
while(counter<=10) {
System.out.print("Kindly insert your" +" "  +"value " + " " + counter  +"              ");
int number = input.nextInt();
if(number >largestNumber ) {
largestNumber = number;
}
mostRecentInput = number;
counter++;
}
System.out.println("the Largest number entered is: " + largestNumber);
System.out.println("the most recent input was: " + mostRecentInput);
}

}