 import java.util.Scanner;
 public class FindTheSecondLargestNumber {
     public static void main(String[] args) {
	int Largest = 0;
        int SecondLarest = 0;
	Scanner input = new Scanner(System.in);
       System.out.println("kindly enter ten integers");
	int number1 = input.nextInt();
	int number2 = input.nextInt();
	int number3 = input.nextInt();
	int number4 = input.nextInt();
	int number5 = input.nextInt();
	int number6 = input.nextInt();
	int number7 = input.nextInt();
	int number8 = input.nextInt();
	int number9 = input.nextInt();
	int number10 = input.nextInt();
  for(int counter = 1; counter <=10; counter++) {
      if( number1 > Largest) {
         Largest = number1;
       }
	System.out.printf("the largest number of all the numbers entered is %d%n", Largest);
       
} 
}
  }
     

     

     

     

     

     

     


     







 