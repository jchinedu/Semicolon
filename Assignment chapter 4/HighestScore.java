import java.util.Scanner;
public class HighestScore {
   public static void main(String[] args) {
	int counter = 1;
	int largest = 0;
	String student = "";
	Scanner input = new Scanner(System.in);
	System.out.print("enter the number of students score you want to input: ");
	int number = input.nextInt();
	while(counter <= number) {
	System.out.print("enter the name of the student" + counter +" :  ");
	String name = input.next();
       	System.out.print("enter the score of the student " + name +" :  ");
	int score = input.nextInt();
	 if(score > largest) {
	    largest = score;
	    student = name;
	 }
	counter++;
}

	System.out.println("the answer is " + student);
	System.out.println("the highest number is" + largest);
}
}
	     


	