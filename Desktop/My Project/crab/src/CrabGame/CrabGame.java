package CrabGame;
import java.security.SecureRandom;

public class CrabGame {

    private static final SecureRandom random = new SecureRandom();


    private enum Status {CONTINUE, WIN, LOST}

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int ELEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        final int TOTAL_GAMES = 1_000_000;

        int[] winsPerRoll = new int[21];
        int[] lossesPerRoll = new int[21];

        int totalWins = 0;
        int totalLosses = 0;
        int totalRolls = 0;

        for (int game = 0; game < TOTAL_GAMES; game++) {
            int rollsThisGame = 1;
            int sum = rollDice();

            Status gameStatus;

            switch (sum) {
                case SEVEN:
                case ELEVEN:
                    gameStatus = Status.WIN;
                    break;
                case SNAKE_EYES:
                case TREY:
                case BOX_CARS:
                    gameStatus = Status.LOST;
                    break;
                default:
                    gameStatus = Status.CONTINUE;
                    int point = sum;

                    while (gameStatus == Status.CONTINUE) {
                        sum = rollDice();
                        rollsThisGame++;

                        if (sum == point)
                            gameStatus = Status.WIN;
                        else if (sum == SEVEN)
                            gameStatus = Status.LOST;
                    }
            }

            totalRolls += rollsThisGame;

            int rollIndex = Math.min(rollsThisGame - 1, 20);

            if (gameStatus == Status.WIN) {
                winsPerRoll[rollIndex]++;
                totalWins++;
            } else {
                lossesPerRoll[rollIndex]++;
                totalLosses++;
            }
        }


        System.out.printf("%-15s%-15s%-15s%n", "Roll#", "Wins", "Losses");
        for (int i = 0; i < winsPerRoll.length; i++) {
            String rollLabel = (i < 20) ? String.valueOf(i + 1) : "After 20";
            System.out.printf("%-15s%-15d%-15d%n", rollLabel, winsPerRoll[i], lossesPerRoll[i]);
        }


        double winPercentage = (double) totalWins / TOTAL_GAMES * 100;
        double avgGameLength = (double) totalRolls / TOTAL_GAMES;

        System.out.printf("%nTotal Games: %,d%n", TOTAL_GAMES);
        System.out.printf("Total Wins: %,d%n", totalWins);
        System.out.printf("Total Losses: %,d%n", totalLosses);
        System.out.printf("Winning Percentage: %.2f%%%n", winPercentage);
        System.out.printf("Average Game Length: %.2f rolls%n", avgGameLength);


        int earlyWins = 0, earlyGames = 0, lateWins = 0, lateGames = 0;
        for (int i = 0; i < 10; i++) {
            earlyWins += winsPerRoll[i];
            earlyGames += winsPerRoll[i] + lossesPerRoll[i];
        }
        for (int i = 10; i < 21; i++) {
            lateWins += winsPerRoll[i];
            lateGames += winsPerRoll[i] + lossesPerRoll[i];
        }

        double earlyWinRate = (double) earlyWins / earlyGames * 100;
        double lateWinRate = (double) lateWins / lateGames * 100;

        System.out.printf("%nWin rate for games ending in first 10 rolls: %.2f%%%n", earlyWinRate);
        System.out.printf("Win rate for games ending after 10 rolls: %.2f%%%n", lateWinRate);
    }

    public static int rollDice() {
        int die1 = 1 + random.nextInt(6);
        int die2 = 1 + random.nextInt(6);
        return die1 + die2;
    }
}
