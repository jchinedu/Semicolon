//The problem is to develop a program that displays the current time in GMT (Greenwich Mean 
Time) in the format hour:minute:second, such as 13:19:8.
 ThecurrentTimeMillis method in the System class returns the current time in mil
liseconds elapsed




public class ShowCurrentTime {
    public static void main(String[] args) {
	long totalMilliseconds = System.currentTimeMillis();
	long totalseconds = totalMilliseconds / 1000;
	long currentsecond = totalseconds % 60;
	long totalMinutes = totalseconds / 60;
	long currentMinute = totalMinutes % 60;
	long totalHours = totalMinutes / 60;
	long currentHour = totalHours % 24;

	 System.out.println("current time is " + currentHour + ":" + currentMinute + ":"  + currentsecond + " GMT");
}
 }