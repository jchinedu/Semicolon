// import the scanner method
// create a class named CostOfShipping
// create a main method
// prompt the user to enter the weight of package and store it in a variable named Weight
// then using if statement display the price of the weight of each package entered by the user using the if statement
// if the weight is less than 0 and less than or equal to 1 the price to be displayed is 3.5$
// if the weight is less than 1 and less than equal to 3 the price to be displayed is 5.5$
// if the weight is less than 3 and less than equal to 10 the price to be displayed is 8.5$
// if the weight is less than 10 and less than equal to 20 the price to be displayed is 10.5$
// if the weight is greater than 50, then display a message saying package cannot be shipped
// then print out your answers after every if statement.


import java.util.Scanner
public class CostOfShipping {
   public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("kindly insert the weight of your package to know how much you are to pay at the counter: ");
        double Weight = input.nextDouble();
	if(Weight < 0 && Weight <= 1) {
		System.out.print("the price of the weight entered is 3.5$");
	}
	else if(if(Weight < 1 && Weight <= 3) {
		System.out.print("the price of the weight entered is 5.5$");
	} 
	else if(if(Weight < 3 && Weight <= 10) {
		System.out.print("the price of the weight entered is 8.5$");
	} 
	else if(if(Weight < 10 && Weight <= 20) {
		System.out.print("the price of the weight entered is 10.5$");
	} 
	else if(if(Weight > 50) {
		System.out.print("the package can not be shipped");
	} 
}
 }



