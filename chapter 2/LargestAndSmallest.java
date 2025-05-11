import java.util.Scanner;
public class LargestAndSmallest{
public static void main (String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Kindly enter first number");
int FirstNumber = input.nextInt();
System.out.print("Kindly enter second number");
int SecondNumber = input.nextInt();
System.out.print("Kindly enter third number");
int ThirdNumber = input.nextInt();
System.out.print("Kindly enter Fourth number");
int FourthNumber = input.nextInt();
System.out.print("Kindly enter Fifth number");
int FifthNumber = input.nextInt();
if(FirstNumber>=SecondNumber && FirstNumber>=ThirdNumber && FirstNumber>=FourthNumber && FirstNumber>=FifthNumber) {
 System.out.printf("the highest number is FirstNumber: %d%n", FirstNumber);
}
if(SecondNumber>=FirstNumber && SecondNumber>=ThirdNumber && SecondNumber>=FourthNumber && SecondNumber>=FifthNumber) {
 System.out.printf("the highest number is SecondNumber: %d%n", SecondNumber);
}
if(ThirdNumber>=FirstNumber && ThirdNumber>=SecondNumber && ThirdNumber>=FourthNumber && ThirdNumber>=FifthNumber) {
 System.out.printf("the highest number is ThirdNumber: %d%n", ThirdNumber);
}
if(FourthNumber>=FirstNumber && FourthNumber>=SecondNumber && FourthNumber>=ThirdNumber && FourthNumber>=FifthNumber) {
 System.out.printf("the highest number is FourthNumber: %d%n", FourthNumber);
}
if(FifthNumber>=FirstNumber && FifthNumber>=SecondNumber && FifthNumber>=ThirdNumber && FifthNumber>=FourthNumber) {
 System.out.printf("the highest number is FifthNumber: %d%n", FifthNumber);
}

if(FirstNumber<=SecondNumber && FirstNumber<=ThirdNumber && FirstNumber<=FourthNumber && FirstNumber<=FifthNumber) {
 System.out.printf("the lowest number is FirstNumber: %d%n", FirstNumber);
}
if(SecondNumber<=FirstNumber && SecondNumber<=ThirdNumber && SecondNumber<=FourthNumber && SecondNumber<=FifthNumber) {
 System.out.printf("the lowest number is SecondNumber: %d%n", SecondNumber);
}
if(ThirdNumber<=FirstNumber && ThirdNumber<=SecondNumber && ThirdNumber<=FourthNumber && ThirdNumber<=FifthNumber) {
 System.out.printf("the lowest number is ThirdNumber: %d%n", ThirdNumber);
}
if(FourthNumber<=FirstNumber && FourthNumber<=SecondNumber && FourthNumber<=ThirdNumber && FourthNumber<=FifthNumber) {
 System.out.printf("the lowest number is FourthNumber: %d%n", FourthNumber);
}
if(FifthNumber<=FirstNumber && FifthNumber<=SecondNumber && FifthNumber<=ThirdNumber && FifthNumber<=FourthNumber) {
 System.out.printf("the lowest number is FifthNumber: %d%n", FifthNumber);
}
}
}


