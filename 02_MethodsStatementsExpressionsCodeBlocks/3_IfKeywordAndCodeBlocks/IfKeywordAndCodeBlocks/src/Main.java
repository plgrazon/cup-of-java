public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (score == 5000) {
            System.out.println("Your score was 5000");
        } else if (score < 1000) {
            System.out.println("Score is less than 1k");
        } else {
            System.out.println("Got here");
        }

        if (gameOver) {
            System.out.println("ggwp");
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        int newFinalScore = score + (levelCompleted * bonus);
        System.out.println(newFinalScore);
    }
}