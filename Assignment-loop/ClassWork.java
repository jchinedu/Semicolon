public class ClassWork {
 public static void main(String[] args) {
	int total = 0;
   int[] score = new int[5];
    score[0] = 22;
    score[1] = 51;
    score[2] = 38;
    score[3] = 23;
    score[4] = 48;
System.out.printf("\t%d %d %d %d %d\n",score[0], score[1], score[2], score[3], score[4]);


for(int counter = 0; counter < score.length; counter++) {
        System.out.printf("%5d\n",score[counter]);

}

  for(int counter = 0; counter < score.length; counter++) {
      total += score[counter];
    }
     System.out.printf("Total of the scores: %d%n", total);

 }
}