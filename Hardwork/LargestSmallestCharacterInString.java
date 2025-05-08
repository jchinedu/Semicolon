import java.util.Scanner;
public class LargestSmallestCharacterInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a String : ");
        String str = scanner.nextLine();
	String word = str.replaceall(" ", "");
	String name = word.length;
	String name = 
       
        
        for(int i=0;i<name;i++) {
  
            if(str.charAt(i) < min) {
                min = str.charAt(i);
            }
            if(str.charAt(i) > max) {
                max = str.charAt(i);
            }
        }
        System.out.println("Max : "+max);
        System.out.println("Min : "+min);
    }
}