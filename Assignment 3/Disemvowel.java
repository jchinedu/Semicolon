import java.util.Scanner;
public class Disemvowel {
 public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("enter a sentence: ");
	String word = input.nextLine();
	String wor = word.replace("a","");
	String modify = wor.replace("e","");
	String modify1 = modify.replace("i","");
	String modify2 = modify1.replace("o","");
	String modify3 = modify2.replace("u","");

	System.out.print(modify3);
}
 }