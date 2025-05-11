import java.util.Scanner;

public class SeperatingDigitInteger{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter integer with five digits:  ");
int number = input.nextInt();
int OriginalNumber = number;

if (OriginalNumber >= 10000){


if (OriginalNumber <= 99999){

int one = number % 10;
number = number / 10;

int two = number % 10;
number = number / 10;

int three = number % 10;
number = number / 10;

int four = number % 10;
number = number / 10;

int five = number % 10;
number = number / 10;



System.out.printf("%d %d %d %d %d%n", five, four, three, two, one);
}
}


if(OriginalNumber > 99999) {
System.out.println(" please enter five digits");
}
if(OriginalNumber < 10000) {
System.out.println(" please enter five digits");
}
}
}
