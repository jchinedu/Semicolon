//create a class named CurrencyExchange
//create a main method 
//import the scanner method
//prompt the user to enter zero to convert from U.S dollar to chinese RMB and 1 to convert from Chinese RMB to U.S dollar
//using the if statement, if the user input is equal to 0, prompt the user to enter the amount he wants to exchange in dollars to Chinese RMB
//if the user input is equal to 1, prompt the user to enter the amount he wants to exchange from Chinese RMB to u.s dollars
//print out the result of the if statments

import java.util.Scanner;
public class CurrencyExchange {
  public static void main(String[] args) {
	double Amount = 0;
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the Exchange rate from dollars to RMB: "); 
	double currency = input.nextDouble();
	if(currency <= 0) {
		System.out.print("invalid input");
	}
	if (currency > 0)  {
	System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		double numb1 = input.nextInt();
        if(numb1 != 0 && numb1 != 1) {
          System.out.print("invalid entry! Enter 0 or 1");
	}
	else if(numb1 == 0) {
	System.out.println("Enter dollar amount: ");
	 Amount = input.nextDouble();
	if(Amount <= 0) {
		System.out.print("sorry amount can not be less than 0");
	}
	else if(Amount > 0) {

  	 double Total = Amount * currency;
  	System.out.printf("$%f is %.1fyuan", Amount, Total);
	}
	}
	else if(numb1 == 1) {
		System.out.print("Enter the RMB amount: ");
		double rmbAmount = input.nextDouble();
        if(rmbAmount <= 0) {
		System.out.print("Amount must be greater than 0");
	}
	else if (rmbAmount > 0) {
  	 double Total = Amount / currency;
  	System.out.printf("$%f is %.1fyuan", Amount, Total);
	}
	
}  	
}
}
} 

         