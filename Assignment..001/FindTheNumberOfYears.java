import java.util.Scanner;
public class FindTheNumberOfYears {
 public static void main(String[] args) {
  
      Scanner input = new Scanner(System.in);
        System.out.print("kindly Enter the number of minutes: ");
         double Minutes = input.nextDouble();
        

        double minutesInaYear = 365 * 24 * 60;
        double minutesInaDay  = 24 * 60;
    
          int years = (int) (Minutes/minutesInaYear);
          double R = Minutes - (years * minutesInaYear);
          int days =  (int) (R / minutesInaDay);
        System.out.printf("%.0f Minutes is approximately %d years and %d days%n", Minutes, years, days);
}
 }

        