public class GameOverScore {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 1600;
        int levelCompleted = 10;
        int bonus = 200;

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
        }

        score = 20000;
        levelCompleted = 16;
        bonus = 400;

        finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
