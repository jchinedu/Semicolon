import java.util.Scanner;
public class DeyPlay {
      public static void main (String[] args) {
          int max = 0;
          int min = 0;
   
          int counter = 1;
 
            Scanner input = new Scanner(System.in);
            System.out.print("kindly enter the number of digits you want to input: ");
               int Number = input.nextInt();
            System.out.println("kindly enter the"+ " " + Number + " " + "values you want to input");
               while( counter <= Number) {

                int num = input.nextInt();
                 counter = counter + 1;
                 if (num > max){
                     num = max;
                    } else {
                  System.out.print("lowest number");
                 }
                                       
                           
                      
                }

                 
                  System.out.printf("the maximum value of the set of integers entered is %d", max);

                 
}
 }
       
       