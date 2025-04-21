public class SumSeries{
  public static void main(String[] args) {
  long counter = 1;
   long sum = 0;
     System.out.printf("%-10s%-10s%n", "TABLE", "INCREAMENT"); 
 while( counter <= 100){
       sum += counter;
  System.out.printf("%-10d%-10d%n",counter, sum);


       counter++;
      

      
         }
     
}   
  
 
}