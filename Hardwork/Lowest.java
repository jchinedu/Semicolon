import java.util.Scanner;

public class Lowest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lowest = 100_000_000_0;           
        int secondLowest = 100_000_000_0;
        String lowestName = "";
        String secondLowestName = "";

        while (true) {
            System.out.print("Enter student name (or 'stop' to finish): ");
            String name = input.next();

            if (name.equalsIgnoreCase("stop")) {
                break;
            }

            System.out.print("Enter score for " + name + ": ");
            int score = input.nextInt();

            if (score < lowest) {
                secondLowest = lowest;
                secondLowestName = lowestName;

                lowest = score;
                lowestName = name;
            } else if (score < secondLowest) {
                secondLowest = score;
                secondLowestName = name;
            }
        }

        System.out.println("Lowest score: " + lowest + " by " + lowestName);
        System.out.println("Second lowest score: " + secondLowest + " by " + secondLowestName);
    }
}
