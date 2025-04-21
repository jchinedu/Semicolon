import java.util.Scanner;
public class StudentGrade {
   public static void main(String[] args) {
	int aCount = 0;
	int bCount = 0;
	int cCount = 0;
	int dCount = 0;
	int fCount = 0;
	Scanner input = new Scanner(System.in);
	System.out.println("Kindly enter the names of five students you want to compute their grades: ");
	String Name = input.nextLine();
	String Name1 = input.nextLine();
	String Name2 = input.nextLine();
	String Name3 = input.nextLine();
	String Name4 = input.nextLine();
      for(int counter = 0; counter < 5; counter++) {
        System.out.printf( "kindly enter the score of each student entered above out of 100: ");
        int Score = input.nextInt();
	if(Score < 0 || Score > 100) {
	System.out.println("Score out of range, please enter a score between o and 100");
	continue;
	}
	switch(Score / 10) {
        case 7:
        case 8:
	case 9:
          case 10:
              ++aCount;
               break;
          case 6:
              ++bCount;
               break;
          case 5:
              ++cCount;
               break;
          case 4:
              ++dCount;
               break;
          default:
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
}
 }

	
	    
