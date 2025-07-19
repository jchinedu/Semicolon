public class GradeExam {
  public static void main(String[] args) {
    char[][] answers = {
      {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
      {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
      {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
      {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
      {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
      {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
      {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
      {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
    };

    char[] keys = {'D','B','D','C','C','D','A','E','A','D'};

    int[][] scores = new int[answers.length][2];

    for (int i = 0; i < answers.length; i++) {
      int correctCount = 0;
      for (int j = 0; j < answers[i].length; j++) {
        if (answers[i][j] == keys[j])
          correctCount++;
      }
      scores[i][0] = i;
      scores[i][1] = correctCount;
    }

    for (int i = 0; i < scores.length - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < scores.length; j++) {
        if (scores[j][1] < scores[minIndex][1]) {
          minIndex = j;
        }
      }
      if (minIndex != i) {
        int[] temp = scores[i];
        scores[i] = scores[minIndex];
        scores[minIndex] = temp;
      }
    }

    for (int i = 0; i < scores.length; i++) {
      System.out.println("Student " + scores[i][0] + "'s correct count is " + scores[i][1]);
    }
  }
}
