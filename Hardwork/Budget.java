import java.util.Scanner;
public class Budget {
  public static void main(String[] args) {
	double FinalPriceperliter = 855;
   Scanner input = new Scanner(System.in);
	System.out.print("kindly enter your budeget to know how many litres of fuel you can buy: ");
	double userbudget = input.nextDouble();
	double Litres = userbudget / FinalPriceperliter;
	if(userbudget <= 0) {
	System.out.print("sorry, you dont have enough budget for fuel today, call again next time");
	}
	else {
	System.out.printf("the litres of fuel  you can afford  is %.2f litres ", Litres);
	}
}
 } 