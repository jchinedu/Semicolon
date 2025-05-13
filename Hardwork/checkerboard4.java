 public class checkerboard4 {
   public static void main(String[] args) {
	for(int i = 1; i <= 10; i++) {
	       if(i % 2 ==0) {
	       System.out.print("* ");
		}
		else {
		System.out.print(" ");
		}
		for(int j = 1; j <= 10; j++) {
		if(j % 2 ==0) {
		System.out.print(" ");
		}
		else
		{
		System.out.print("*");
		} 
		}
		System.out.println("");
	 }
}
  }