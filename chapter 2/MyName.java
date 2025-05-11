import java.util.Scanner;
public class MyName{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("input five digit number");
int M = input.nextInt();
if(M <= 99999) {
System.out.print("5 digit number"); 
}else {
System.out.print("sorry please insert 5 digit"); 
}
int A = M/10000;
int B = M % 10000;
int C = B/1000;
System.out.println("\n" + "the answer is" +"A"+"  "+"C");
}
}     