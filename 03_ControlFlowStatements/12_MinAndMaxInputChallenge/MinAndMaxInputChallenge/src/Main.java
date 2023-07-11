import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        while (true) {
            System.out.println("Enter number");

            if (!scanner.hasNextInt()) {
                break;
            }

            int input = scanner.nextInt();

            if (input > max) max = input;
            if (input < min) min = input;

            scanner.nextLine();
        }
        scanner.close();
        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }
}