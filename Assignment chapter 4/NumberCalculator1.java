import java.util.Scanner;

public class NumberCalculator1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	String continueOperation;
        
    
        do {
            System.out.println("""
=================================================================
CHOOSE THE OPERATION YOU WANT TO PERFORM OR 0 TO EXIT
=================================================================
1- ADDITION
2- SUBTRACTION
3- MULTIPLICATION
4- DIVISION
5- Squareroot
=================================================================
                    """);

            int userchoice = input.nextInt();

            switch (userchoice) {
                case 1: 
                    do {
                        System.out.print("""
                                ============================================================================
                                Kindly enter the two integers you want to add, separated by a space:  
                                ============================================================================
                        """);
                        int number1 = input.nextInt();
                        int number2 = input.nextInt();
                        int sum = number1 + number2;
                        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum);
                        System.out.print("Do you want to perform the operation again? (yes/no): ");
                        continueOperation = input.next();
                    } while (continueOperation.equalsIgnoreCase("yes"));
                    break;

                case 2: 
                    do {
                        System.out.print("""
                                =============================================================================
                                Kindly enter the two integers you want to subtract, separated by a space:  
                                =============================================================================
                        """);
                        int number1 = input.nextInt();
                        int number2 = input.nextInt();
                        int result = number1 - number2;
                        System.out.println("The subtraction of " + number1 + " and " + number2 + " is: " + result);
                        System.out.print("Do you want to perform the operation again? (yes/no): ");
                        continueOperation = input.next();
                    } while (continueOperation.equalsIgnoreCase("yes"));
                    break;

                case 3: 
                    do {
                        System.out.print("""
                                ================================================================================
                                Kindly enter the two integers you want to multiply, separated by a space:  
                                ================================================================================
                        """);
                        int number1 = input.nextInt();
                        int number2 = input.nextInt();
                        int result = number1 * number2;
                        System.out.println("The multiplication of " + number1 + " and " + number2 + " is: " + result);
                        System.out.print("Do you want to perform the operation again? (yes/no): ");
                        continueOperation = input.next();
                    } while (continueOperation.equalsIgnoreCase("yes"));
                    break;

                case 4: 
                    do {
                        System.out.print("""
                                =============================================================================
                                Kindly enter the two integers you want to divide, separated by a space:  
                                =============================================================================
                        """);
                        double number1 = input.nextInt();
                        double number2 = input.nextInt();
                        if (number2 != 0) {
                            double result = number1 / number2;
                            System.out.println("The division of " + number1 + " and " + number2 + " is: " + result);
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                        }
                        System.out.print("Do you want to perform the operation again? (yes/no): ");
                        continueOperation = input.next();
                    } while (continueOperation.equalsIgnoreCase("yes"));
			if(continueOperation.equalsIgnoreCase("no"))
                    break;
		  case 5:
			do {
                        System.out.print("""
                                =============================================================================
                                Kindly enter the two integers you want to get the squareroot, separated by a space:  
                                =============================================================================
                        """);
                        double number1 = input.nextInt();
                        double number2 = input.nextInt();
                        if (number2 != 0) {
                            double result = Math.sqrt(number1); 
			    double result1 = Math.sqrt(number2);
                            System.out.println("The squareroot of " + number1 + " is: " + result);
			    System.out.println("The squareroot of " + number2 + " is: " + result1);

                        } else {
                            System.out.println("Error: squareroot of zero is not allowed.");
                        }
                        System.out.print("Do you want to perform the operation again? (yes/no): ");
                        continueOperation = input.next();
                    } while (continueOperation.equalsIgnoreCase("yes"));
                    break;

                case 0: 
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid operation.");
            }
		System.out.print("Do you want to perform the whole process again? (yes/ or press 0 to quit): ");
                        continueOperation = input.next();
        } while (continueOperation.equalsIgnoreCase("yes") || continueOperation.equalsIgnoreCase("no"));
	  return;
        
         }
}
