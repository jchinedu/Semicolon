import java.util.Scanner;
public class UppercaseLetter{
public static void main(String[] main) {
int count = 0;
 Scanner input = new Scanner(System.in);
 System.out.print("kindly enter a word or sentence to enable this counter count the uppercase leters");
 String name = input.nextLine();
 for (int i = 0; i <name.length(); i++) {
  char ch = name.charAt(i);
  if (Character.isUpperCase(ch)) {
     count++; 
}
}
System.out.print(count);

}
}