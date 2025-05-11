import java.util.Scanner;
public class Seperation {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("input five digit number");
int penta = input.nextInt();
 int A = penta/10000;
   int B = penta % 10000;
 int C = B/1000;
int D = B % 1000;
int E = B/100;
int F = E % 100;
int G = F/10;
int H = G % 1;
int I = H/1;
System.out.print("the answer is" +"A"+"  "+"C"+"  "+"E"+"  "+"G"+"  "+"I");
}
}     