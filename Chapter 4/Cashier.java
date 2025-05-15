import java.util.Scanner;
public class Cashier {
public static void main(String[] args) {
double baseSalary = 200.0;
double commissionRate = 0.09;
double totalsales = 0;
Scanner input = new Scanner(System.in);	
System.out.println("these are the prices of different items, Item 1 = 239.99$:, Item 2 = 129.75$:, Item 3 = 99.95$:, Item 4 = 350.89$ :"); 
while(true) {
System.out.println("ENTER THE ITEM SOLD OR ENTER -1 TO QUIT, 1 FOR ITEM 1, 2 FOR ITEM 2, 3 FOR ITEM 3, 4 FOR ITEM 4: ");
int numItems = input.nextInt();
if(numItems == -1) {
  break;
}
System.out.print("Enter the quantity sold for item: ");
int quantity = input.nextInt();
if(numItems == 1) {
totalsales += 239.99 * quantity;
}
else if(numItems == 2) {
totalsales += 129.75 * quantity;
}
else if(numItems == 3) {
totalsales += 99.95 * quantity;
}
else if(numItems == 4) {
totalsales += 350.89 * quantity;
}
}
double commission = totalsales * commissionRate;
double totalEarnings = baseSalary + commission;
System.out.println("\nTotal sales: $" + totalsales);
System.out.println("commission earned: $" + commission);
System.out.println("total earnings: $" + totalEarnings);
}
}

