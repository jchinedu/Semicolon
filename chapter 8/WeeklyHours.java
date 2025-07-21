public class WeeklyHours {
  public static void main(String[] args) {
    int[][] hours = {
      {2, 4, 3, 4, 5, 8, 8},
      {7, 3, 4, 3, 3, 4, 4},
      {3, 3, 4, 3, 3, 2, 2},
      {9, 3, 4, 7, 3, 4, 1},
      {3, 5, 4, 3, 6, 3, 8},
      {3, 4, 4, 6, 3, 4, 4},
      {3, 7, 4, 8, 3, 8, 4},
      {6, 3, 5, 9, 2, 7, 9}
    };

    int[][] totals = new int[hours.length][2];

    for (int i = 0; i < hours.length; i++) {
      int total = 0;
      for (int j = 0; j < hours[i].length; j++) {
        total += hours[i][j];
      }
      totals[i][0] = i;
      totals[i][1] = total;
    }

    // Sort totals in descending order of hours using selection sort
    for (int i = 0; i < totals.length - 1; i++) {
      int maxIndex = i;
      for (int j = i + 1; j < totals.length; j++) {
        if (totals[j][1] > totals[maxIndex][1]) {
          maxIndex = j;
        }
      }
      if (maxIndex != i) {
        int[] temp = totals[i];
        totals[i] = totals[maxIndex];
        totals[maxIndex] = temp;
      }
    }

    // Display results
    System.out.println("Employee\tTotal Hours");
    for (int i = 0; i < totals.length; i++) {
      System.out.println("Employee " + totals[i][0] + "\t\t" + totals[i][1]);
    }
  }
}
