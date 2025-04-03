public class CustomersMain {
public static void main(String[] args) { 
        Customers customer1 = new Customers(12345678, 25000.0, 200000.0, 150000, 100000);
        Customers customer2 = new Customers(12345679, 3000.0, 105000.0, 120000, 100000);
        Customers customer3 = new Customers(12345680, 77000.0, 250000.0, 180000, 100000);
        Customers customer4 = new Customers(12345681, 88000.0, 300000.0, 200000, 100000);
        Customers customer5 = new Customers(12345682, 69000.0, 100000.0, 130000, 100000);
int counter = 1;
 while (counter <= 5) {
            Customers currentCustomer = null; 
if (counter == 1) {
                
 currentCustomer = customer1;
            } else if (counter == 2) {
                currentCustomer = customer2;
            } else if (counter == 3) {
                currentCustomer = customer3;
            } else if (counter == 4) {
                currentCustomer = customer4;
            } else if (counter == 5) {
                currentCustomer = customer5;
            }
System.out.println("\nCustomer " + counter + ":");
            System.out.println("Account Number: " + currentCustomer.getaccountNumber());
            System.out.println("Balance at the Beginning of the Month: $" + currentCustomer.getbalanceAtTheBeginningOfTheMonth());
            System.out.println("Total Charges: $" + currentCustomer.gettotalCharges());
            System.out.println("Total Monthly Credit: $" + currentCustomer.gettotalMonthlyCredit());
            System.out.println("Allowed Credit: $" + currentCustomer.getallowedCredit());
boolean limitExceeded = currentCustomer.isLimitExceeded(0);
            if (limitExceeded) {
                System.out.println("Credit limit exceeded.");
            } else {
                System.out.println("Credit limit not exceeded.");
            }
            counter++;
        }
    }
}




