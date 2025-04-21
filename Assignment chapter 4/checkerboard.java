 public class checkerboard {
   public static void main(String[] args) {
	for(int i = 1; i <= 8; i++) {
	       if(i % 2 ==0) {
	       System.out.print("* ");
		}
		else {
		System.out.print(" ");
		}
		for(int j = 1; j <= 16; j++) {
		if(j % 2 ==0) {
		System.out.print(" ");
		}
		else
		{
		System.out.print("* ");
		}
		}
		System.out.println("");
	 }
}
  }