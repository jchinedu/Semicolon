import java.util.Scanner;
public class RunWayLengtht {
 public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("kindly Enter the number the values of Speed and Accleration: ");
         double Speed = input.nextDouble();
	 double Acc = input.nextDouble();


         double Length = (Speed * Speed) / (2 * Acc);
        System.out.printf("the minimum runway length for this airplane is : %.3f%n", Length);
}
 }	  