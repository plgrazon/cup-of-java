public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Paolo", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        System.out.println("5'7\" " +calcFeetAndInchesToCentimeters(5, 7));
        System.out.println("67\" " + calcFeetAndInchesToCentimeters(67));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " score " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 && (inches < 0 || inches > 12)) {
            return -1;
        }

        double ftToCm = feet / 0.032808;
        double inToCm =  inches / 0.39370;

        return ftToCm + inToCm;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0.0) {
            return -1;
        }

        double ft = Math.floor(inches / 12);
        // another way
        // double ft = (int) inches / 12;
        double in = inches % 12;

        return calcFeetAndInchesToCentimeters(ft, in);
    }

}