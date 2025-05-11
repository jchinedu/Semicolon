import java.util.Scanner;
public class Addition {
       public static void main(String[] args) {
              Scanner input = new Scanner (System.in);
              System.out.print("input first integer");
              int num1 = input.nextInt(); 
              System.out.print("input second integer");
              int num2 = input.nextInt();
              int sum = (num1 + num2);
              System.out.printf("sum is %d%n", sum);
}
}
 

