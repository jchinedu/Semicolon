 //(Current date and time) Invoking System.currentTimeMillis() returns the 
//elapsed time in milliseconds since midnight of January 1, 1970. Write a program 
//that displays the date and time. Here is a sample run:
 //Current date and time is May 16, 2012 10:34:23







public class ShowCurrentTime {
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        long totalDays = totalHours / 24;

        int year = 1970;
        while (totalDays >= (isLeap(year) ? 366 : 365)) {
            totalDays -= isLeap(year) ? 366 : 365;
            year++;
        }

        int month = 1, day = 0;
        while (month <= 12) {
            int dim = getDaysInMonth(month, year);
            if (totalDays >= dim) {
                totalDays -= dim;
                month++;
            } else {
                day = (int) totalDays + 1;
                break;
            }
        }

        String monthName = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Unknown";
        };

        System.out.println("Current date and time is " +
                monthName + " " + day + ", " + year + " " +
                currentHour + ":" + currentMinute + ":" + currentSecond);
    }

    static boolean isLeap(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }

    static int getDaysInMonth(int m, int y) {
        return switch (m) {
            case 2 -> isLeap(y) ? 29 : 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };
    }
}
