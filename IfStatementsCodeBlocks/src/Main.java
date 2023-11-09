public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 1600;
        int levelCompleted = 10;
        int bonus = 200;

        if (score < 10000 && score > 2000) {
            System.out.println("Your score was less than 10000 but greater than 2000");
        } else if (score < 2000) {
            System.out.println("Your score was less than 2000");
        } else {
            System.out.println("Just here!!");
        }
    }
}
