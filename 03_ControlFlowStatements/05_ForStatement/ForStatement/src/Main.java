public class Main {
    public static void main(String[] args) {
        System.out.println("10,000 @ 2% interest = " + calculateInterest(10000.0, 2.0));

        for (int i = 2; i < 9; i++) {
            String amount = String.format("%.2f", calculateInterest(10000, i));
            System.out.println("10,000 @ " + (double) i + "% interest = " + amount);
        }

        System.out.println("reverse loop");
        // reverse loop
        for (double i = 8; i >= 2; i -= 1d) {
            String amount = String.format("%.2f", calculateInterest(10000, i));
            System.out.println("10,000 @ " + i + "% interest = " + amount);
        }
        // isPrime
        isPrimeRange(10);
    }

    public static void isPrimeRange(int range) {
        int primeCounter = 0;

        for (int i = 0; i <= range; i++) {
            if (isPrime(i)) {
                System.out.println("isPrime " + i);
                primeCounter++;
            }
            if (primeCounter == 3) break;
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        // optimization = i <= (long) Math.sqrt(n)
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}