import java.util.Scanner;
public class Cashier {
public static void main(String[] args) {
double baseSalary = 200.0;
double commissionRate = 0.09;
double totalsales = 0;
Scanner input = new Scanner(System.in);
System.out.println("enter the number  of different item sold: ");
int numItems = input.nextInt();
for(int i = 1; i <= numItems; i++) {
System.out.print("enter the price of item " + i + ": ");
double price = input.nextDouble();
System.out.print("Enter the quantity sold for item " + i + ": ");
int quantity = input.nextInt();
totalsales += price * quantity;
}
double commission = totalsales * commissionRate;
double totalEarnings = baseSalary + commission;
System.out.println("\nTotal sales: $" + totalsales);
System.out.println("commission earned: $" + commission);
System.out.println("total earnings: $" + totalEarnings);
}
}

