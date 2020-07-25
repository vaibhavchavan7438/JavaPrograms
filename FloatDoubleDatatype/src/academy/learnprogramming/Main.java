package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(true, 800, 5, 100);

        levelCompleted = 5;
        bonus = 100;
        score = 800;


        calculateScore(true, 10000, 8, 200);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Arati", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Siddesh", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Sanjay", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Akhilesh", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " in the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {

        if (playerScore > 1000) {
            return 1;
        } else if (playerScore <= 1000 && playerScore > 500) {
            return 2;
        } else if (playerScore <= 500 && playerScore > 100) {
            return 3;
        }
        return 4;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver == true) {


            int FinalScore = score + (levelCompleted * bonus);
            FinalScore += 1000;
            System.out.println("your Final score is " + FinalScore);
            return FinalScore;
        }
        return -1;
    }


}
