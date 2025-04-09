import java.util.Scanner;
public class Five {
      public static void main (String[] args) {
          int max = 0;
          int min = 0;
 
            Scanner input = new Scanner(System.in);
            System.out.print("kindly enter five digits you want to input: ");
               int Num1 = input.nextInt();
               int Num2 = input.nextInt();
               int Num3 = input.nextInt();
               int Num4 = input.nextInt();
               int Num5 = input.nextInt();

             if(Num1 > max) {
         
                max = Num1; }
             if(Num2 > max) {
                max = Num2;
               }
             if(Num3 > max) {
                max = Num3;
                }
             if(Num4 > max) {
                max = Num4;
                }
             if(Num5 > max) {
                max = Num5;
                }
              if(Num1 > min) {
         
                min = Num1; }
             if(Num2 < min) {
                min = Num2;
               }
             if(Num3 < min) {
                min = Num3;
                }
             if(Num4 < min) {
                min = Num4;
                }
             if(Num5 < min) {
                min = Num5;
                }


    int sum = max + min;

        





           
           
                                       
                           
           System.out.printf("\nthe maximum number is %d", max);
           System.out.printf("\nthe minimum number is %d", min);
           System.out.printf("\n the sum of the extremes are %d", sum);

                
                 }
                }
 
                 
                  
                        