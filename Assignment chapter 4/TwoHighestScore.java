import java.util.Scanner;
public class TwoHighestScore {
   public static void main(String[] args) {
	int counter = 1;
	int largest = 0;
	int secondlargest = 0;
	String student = "";
	String Student = "";
	Scanner input = new Scanner(System.in);
	System.out.print("enter the number of students score you want to input: ");
	int number = input.nextInt();
	while(counter <= number) {
	System.out.println("enter the name of the student  " + counter +" :  ");
	String name = input.next();
       	System.out.println("enter the score of the student  " + name +" :  ");
	 int score = input.nextInt();
	 if(score >= largest) {
	    secondlargest = largest;
	    Student = student;
	    largest = score;
	    student = name;
	 }else  if (score >= secondlargest && score != largest) {
	     secondlargest = score;
	     Student = name;
	}

	counter++;
}

	System.out.println("the answer is   " + student + "   and   " + Student);
	System.out.println("the highest number is   " + largest + "  and   " + secondlargest);
}
}
	     


	