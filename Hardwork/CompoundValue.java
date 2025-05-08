import java.util.Scanner;
public class CompoundValue {
 public static void main(String[] args){
	double total = 0;
	int count = 1;
	Scanner input = new Scanner(System.in);
	System.out.print("kindly enter the amount: ");
	double amount = input.nextDouble();
	System.out.print("kindly enter the rate: ");

	double rate = input.nextDouble();
	System.out.print("kindly enter the number of months: ");

	int months = input.nextInt();
	while(count <= months) {
	total = (amount + total) * (1 + (rate / 1200));
	System.out.printf("the compound interest for month %d is %f\n", count, total);
	count++;
	}
}
 }
	