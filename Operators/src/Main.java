public class Main {
    public static void main(String[] args) {
        int result = 1 + 2; // 1 + 2 = 3;
        int previousResult = result;
        System.out.println("prev = " + previousResult);

        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("prev = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // 4 / 3 = 1
        System.out.println("4 * 3 = " + result);

        result++;
        System.out.println(result); // 2
        result--;
        System.out.println(result); // 1
        result += 2;
        System.out.println(result); // 3
        result *= 10;
        System.out.println(result); // 30
        result /= 5;
        System.out.println(result); // 6
        result -= 3;
        System.out.println(result); // 3
        result %= 3;
        System.out.println(result); // 0

        boolean isAlien = false;

        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;

        if (topScore <= 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;

        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (topScore <= 90)) {
            System.out.println("Eiter or both the condition are true");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("a car");
        }

        boolean wasCar = isCar ? true : false;
        System.out.println(wasCar);
    }
}