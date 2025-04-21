public class PrintAtable {
 public static void main(String[] args) {
   int A = 1;
   int B = 2;
   double square;
	System.out.printf("%s\t%s\t%s\t\n", " A", "B", "C");
  for(A = 1; A <= 5; A++) {
      B = A + 1;   
	square = Math.pow(A, B);
	int intsquare = (int) square;
     System.out.printf("%d\t%d\t%d\t\n", A, B, intsquare);
 
}
}
}