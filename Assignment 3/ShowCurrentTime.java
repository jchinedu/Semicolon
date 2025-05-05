 //(Current date and time) Invoking System.currentTimeMillis() returns the 
//elapsed time in milliseconds since midnight of January 1, 1970. Write a program 
//that displays the date and time. Here is a sample run:
 //Current date and time is May 16, 2012 10:34:23







public class ShowCurrentTime {
public static void main(String[] args) {
 long totalmilliseconds = System.currentTimeMillis();
   long totalseconds = totalmilliseconds / 1000;
   long currentseconds = totalseconds % 10;
   long totalMinutes = totalseconds / 60;
   long currentminute = totalMinutes % 60;
   long totalhours   = totalMinutes / 60;
   long currenthours = totalhours % 24; 
   System.out.print("current date and time is " + currenthours + ":" +currentminute +":" + currentseconds);
}
 }

   
 
 