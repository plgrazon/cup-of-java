public class Main {
    public static void main(String[] args) {
        int count = 1;

        while (count != 6) {
            System.out.println("value " + count);
            count++;
        }

        for (count = 1; count != 6; count++) {
            System.out.println("value " + count);
        }

        count = 1;

        do {
            System.out.println("count value was " + count);
            count++;
        } while (count != 6);

        // challenge
        int start = 4;
        int end = 20;
        int evenNumCount = 0;

        while (start <= end) {
            start++;

            if (!isEvenNumber(start)) continue;

            evenNumCount++;
            System.out.println("even " + start);

            if (evenNumCount == 5) {
                System.out.println("total even " + evenNumCount);
                break;
            }
        }

        System.out.println(sumDigits(125));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(32_123));

    }

    private static boolean isEvenNumber(int num) {
        return num % 2 == 0;
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int totalSum = 0;

        while (number > 0) {
            totalSum += number % 10;
            number /= 10;
        }

        return totalSum;
    }
}