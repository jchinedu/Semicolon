import java.util.Scanner;
public class NumberCount {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("input five digit number");
int penta = input.nextInt();
if (penta < 10000 || penta > 99999) {
System.out.println("Sorry, please insert a valid five-digit number.");
} else {
System.out.println("Yeah! You are good to go.");
int A = penta % 10;
penta = penta /  10;
int B = penta % 10;
penta = penta / 10;
int C = penta % 10;
penta = penta / 10;
int D = penta % 10;
penta = penta / 10;
int E = penta % 10;
System.out.print("the answer is" +" "+E+"  "+D+"  "+C+"  "+B+"  "+A);
}
input.close();
}
}     