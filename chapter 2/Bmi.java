import java.util.Scanner;
public class Bmi {
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("please input your weight in Pounds :");
int W = input.nextInt();
System.out.print("please input your height in Inches :");
int H = input.nextInt();
double BMI = ((W*703)/(H*H));
System.out.print("your Body Mass Index is :" + BMI);
if(BMI < 18.5) {
System.out.print("\n" + "sorry you are underweight"); }
if(BMI >= 18.5 && BMI <= 24.9 ) {
System.out.print("\n" + "congratulations you are normal weight"); }
if(BMI >= 25 && BMI <= 29.9) {
System.out.print("\n" + "sorry you are overweight"); }
if(BMI >= 30) {
System.out.print("\n" + "sorry you are obessed"); }
input.close();
}
}