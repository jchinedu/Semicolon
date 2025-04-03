import java.util.Scanner;
public class EvenAndOdd {
 public static void main(String[] args) {
  int SUMOFEVEN = 0;
  int SUMOFODD = 0;
  int counter = 0;
      Scanner input = new Scanner(System.in);
        System.out.print("kindly Enter the number of values you want to input: ");
         int Number = input.nextInt();
	System.out.print("kindly enter" +" "+   Number  +" "+     "values: ");
        for(counter = 0; counter < Number; counter++) {
           int num = input.nextInt();
          if(num % 2 == 0) {
          SUMOFEVEN += num;
          }
          else {
          SUMOFODD += num;
          }
          }
         System.out.printf("the sum of the even numbers id %d%n",SUMOFEVEN);
         System.out.printf("the sum of the odd numbers id %d%n",SUMOFODD);
}
 }



