import java.util.Scanner;

public class LastWordLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine().trim();

        int length = 0;

        for (int i = sentence.length() - 1; i >= 0; i--) {
            if (sentence.charAt(i) != ' ') {
                length++;
            } else if (length > 0) {
                break;
            }
        }

        System.out.println("Length of last word: " + length);
    }
}
