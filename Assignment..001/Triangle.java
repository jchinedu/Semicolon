public class Triangle {
  public static void main(String[] args) {
    int max = 10;
       
        for(int row = 1; row <= max; row++) {
         for(int star = 1; star <= row; star++){
         System.out.print("*");
}
         System.out.println(" ");
}



        
        for(int row = 1; row <= max; row++) {
        for(int space = max-1; space > 0; space--){
            System.out.print(" ");
           }
       
         for(int star = 1; star <= row; star++){
         System.out.print("*");
}
         System.out.println(" ");
}







}
 }   