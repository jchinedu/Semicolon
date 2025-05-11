import java.util.Scanner;

public class FutureDaySwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter today's day (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");
        int today = input.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int elapsed = input.nextInt();

        int future = (today + elapsed) % 7;

        String todayName = "";
        String futureName = "";

        switch (today) {
            case 0: todayName = "Sunday"; break;
            case 1: todayName = "Monday"; break;
            case 2: todayName = "Tuesday"; break;
            case 3: todayName = "Wednesday"; break;
            case 4: todayName = "Thursday"; break;
            case 5: todayName = "Friday"; break;
            case 6: todayName = "Saturday"; break;
        }

        switch (future) {
            case 0: futureName = "Sunday"; break;
            case 1: futureName = "Monday"; break;
            case 2: futureName = "Tuesday"; break;
            case 3: futureName = "Wednesday"; break;
            case 4: futureName = "Thursday"; break;
            case 5: futureName = "Friday"; break;
            case 6: futureName = "Saturday"; break;
        }

        System.out.println("Today is " + todayName + " and the future day is " + futureName);
    }
}
