import java.util.Scanner;
public class SingleDigitLength {
    public static int getLengthOfMultiplication(int num) {
        int count = 0;
        while (num >= 10) {
            int product = 1;
            while (num > 0) {
                int digit = num % 10;
                product *= digit;
                num /= 10; 
            }
            
            num = product; 
            count++; 
        }
        
        return count;
    }
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("enter a number: ");
        int num = input.nextInt(); 
        int result = getLengthOfMultiplication(num);
        System.out.println("The length of the multiplication steps to reach a single digit is: " + result);
    }
}
