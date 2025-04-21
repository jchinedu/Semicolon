import java.util.Scanner;
public class Motunrayo{
public static void main(String[]args){
int debola;
int counter = 1;
Scanner input = new Scanner(System.in);
while (counter > 0) {
System.out.print("enter a number");
debola = input.nextInt();
counter++;
if (counter == 5){
break;
}
}
}
}