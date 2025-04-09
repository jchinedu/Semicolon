public class DivisibleIntegers {
   public static void main(String[] args) {
     int sum = 0;
     int count = 0;

      while(count <= 30) {
         if(count % 3 == 0) {
        System.out.printf("the numbers divisible by 3 from 1-30 are %d%n", count);
             sum += count;
         }
             count = count + 1;
   
         }
        System.out.printf("the sum of the digits from 1 - 30 divisible by 3 is %d", sum);
     
}
 }