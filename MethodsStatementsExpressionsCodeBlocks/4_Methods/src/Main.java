public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("high score " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("high score " + highScore);

        // Ai
        int aScore = calculateHighScorePosition(1500);
        displayHighScorePosition("Ai", aScore);
        // Bo
        int bScore = calculateHighScorePosition(900);
        displayHighScorePosition("Bo", bScore);
        // Ce
        int cScore = calculateHighScorePosition(400);
        displayHighScorePosition("Ce", cScore);
        // Dy
        int dScore = calculateHighScorePosition(50);
        displayHighScorePosition("Dy", dScore);
        // Ei
        int eScore = calculateHighScorePosition(1000);
        displayHighScorePosition("Ei", aScore);
        // Fo
        int fScore = calculateHighScorePosition(500);
        displayHighScorePosition("Fo", bScore);
        // Gu
        int gScore = calculateHighScorePosition(100);
        displayHighScorePosition("Gu", cScore);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;
    }

    public static void displayHighScorePosition(String playerName, int standing) {
        System.out.println("Player " + playerName + " Placed " + standing);
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}