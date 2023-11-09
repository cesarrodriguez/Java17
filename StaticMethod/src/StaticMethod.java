public class StaticMethod {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 1600;
        int levelCompleted = 10;
        int bonus = 200;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("The highScore is " + highScore);
        score = 20000;
        levelCompleted = 16;
        bonus = 400;
        System.out.println("The next highScore is " +
                calculateScore(gameOver, score, levelCompleted, bonus));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 2000;
        }
        return finalScore;
    }
}
