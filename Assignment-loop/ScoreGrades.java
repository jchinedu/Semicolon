import java.util.Scanner;
public class ScoreGrades {
 public static void main(String[] args) {
	int aCount = 0;
	int bCount = 0;
	int cCount = 0;
	int dCount = 0;
	int fCount = 0;
	int Vcount = 0;
	int validcount = 0;
	Scanner input = new Scanner(System.in);
	while(validcount < 10) {
	System.out.print("kindly enter the score of the students:   ");
	int score = input.nextInt();
	if(score < 0 || score > 100) {
	System.out.println("Score out of range, please enter a score between 0 and 100");
	Vcount++;
	continue;
	}
	validcount++;
	switch(score / 10) {
        case 8:
	case 9:
          case 10:
		System.out.println("A");
              ++aCount;
               break;
          case 7:
		System.out.println("B");
              ++bCount;
               break;
          case 6:
	       System.out.println("C");
              ++cCount;
               break;
          case 5:
	      System.out.println("D");
              ++dCount;
               break;
          default:
	      System.out.println("F");
              ++fCount;
               break;
	}
	 }
       System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                      "Number of students who received each grade:",
                      "A: ", aCount,
                      "B: ", bCount, 
                      "C: ", cCount,  
                      "D: ", dCount,
                      "F: ", fCount);
	System.out.printf("number of invalid inputs are %d%n", Vcount);
}
 }

	
 