import java.util.Scanner;
import java.util.Random;

public class AdditionQuiz {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int num1 = random.nextInt(100); // Generates a number from 0 to 99
        int num2 = random.nextInt(100);

        System.out.print("What is the sum of " + num1 + " and " + num2 + "? ");
        int userAnswer = input.nextInt();

        boolean isCorrect = userAnswer == (num1 + num2);
        System.out.println(isCorrect);
    }
}
