public class PlateNumber{
	public static void main(String[] args) {
		int letter1 = 65 + (int)(Math.random() * (90 - 65));
		int letter2 = 65 + (int)(Math.random() * (90 - 65));
		int letter3 = 65 + (int)(Math.random() * (90 - 65));
		

		int number1 = (int)(Math.random() *10);
		int number2 = (int)(Math.random() *10);
		int number3 = (int)(Math.random() *10);

	System.out.printf(" " + (char)(letter1) + (char)(letter2) + (char)(letter3) + "-" +"%d%d%d", number1, number2, number3);
}
	}