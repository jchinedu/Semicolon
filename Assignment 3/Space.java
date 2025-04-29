import java.util.Scanner;
public class Space {
 public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a sentence: ");
	String Name = input.nextLine();
	String word = Name.replaceAll("\s","");
	System.out.print(word);
}
 }
	
	


