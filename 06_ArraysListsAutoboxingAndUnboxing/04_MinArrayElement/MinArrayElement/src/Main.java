import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] userArray = Main.readIntegers(5);
        System.out.println("min element from array " + findMin(userArray));
    }

    private static int[] readIntegers(int number) {
        System.out.println("Enter " + number + " integers");

        int[] intArray = new int[number];

        for (int i = 0; i < number; i++) {
            intArray[i] = scanner.nextInt();
        }

        System.out.println("integer array is " + Arrays.toString(intArray));

        return intArray;
    }

    private static int findMin(int[] intArray) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < min) {
                min = intArray[i];
            }
        }

        return min;
    }
}