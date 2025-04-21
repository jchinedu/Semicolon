public class DisplayPatterns{
  public static void main(String[] args) {
	for(int count = 1; count <= 6; count++) {
	for(int counter = 1; counter <= count; counter++) {
	System.out.print(" "+counter+" ");
	}
	System.out.println("  ");
	}
	 System.out.println();
	for(int count = 6; count >= 1; count--) {
	for(int counter = 1; counter <= count; counter++) {
	System.out.print(" "+counter+" ");
	}
	System.out.println("  ");
	}
	System.out.println();
	for(int count = 1; count <= 6; count++) {
	for(int counter = 5; counter >= count; counter--) {
	System.out.print(" ");
	}
	for(int k =1; k<= count; k++) {
	System.out.print(k);
	}
	System.out.println();
	}
	for(int count = 1; count <= 6; count++) {
	for(int counter = 1; counter <= count; counter++) {
	System.out.print(" ");
	}
	for(int k =6; k>= count; k--) {
	System.out.print(k);
	}
	System.out.println();
	}



}
   } 