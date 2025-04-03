import java.util.Scanner;
public class SumTheDigit {
 public static void main(String[] args) {
int Sum = 0;


        Scanner input = new Scanner(System.in);
        System.out.print("kindly Enter values between 0 and 1000: ");
         int num = input.nextInt();
	 if(num >= 0 && num <= 1000) {
          while(num > 0) {
            Sum += num % 10;
            num /= 10;
         }
       System.out.println("the sum of digits is " + " " +   Sum);
         } else {
       System.out.print("please insert a number between 0 and 1000");
         }
}
 }
           
