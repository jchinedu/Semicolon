public class Trianglee {
  public static void main(String[] args) {
    int max = 10;
       
        for(int row = 1; row <= max; row++) {
         for(int star = 1; star <= row; star++){
         System.out.print("*");
}
         System.out.println(" ");
}



        
        for(int row = 1; row <= max; row++) {
        for(int space = row; space <=max; space++){
            System.out.print(" ");
           }
       
         for(int star = 1; star < row; star++){
         System.out.print("*");
}
         System.out.println("  ");
}
         System.out.println(" ");
        

         for(int row = 1; row <= max; row++) {
        for(int space = row; space <=max; space++){
            System.out.print("*");
           }
       
         for(int star = 1; star < row; star++){
         System.out.print("   ");
}
         System.out.println("   ");
}

        for(int row = 1; row <= max; row++) {
         for ( int space = 1; space < row; space++) {
              System.out.print(" ");
}
         for(int star = row; star < max; star++){
         System.out.print("*");
}
         System.out.println("");
}







}
 }   