import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] integerArray = getIntegers(5);
        int[] sortedIntegerArray = reverseSortIntegers(integerArray);
        printIntegers(sortedIntegerArray);
    }

    public static int[] getIntegers(int number) {
        int[] integerArray = new int[number];

        System.out.println("Enter " + number + " integers\r");

        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i] = scanner.nextInt();
        }

        return integerArray;
    }

    public static void printIntegers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("array element " + i + " is " + array[i]);
        }
    }

    public static int[] reverseSortIntegers(int[] array) {
        // copy array
        int[] sorted = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sorted[i] = array[i];
        }
        // copy array
        int [] sortedCopy = Arrays.copyOf(array, array.length);

        for (int i = 0; i < sorted.length; i++) {
            int temp;

            for (int j = 0; j < sorted.length - i - 1; j++) {
                if (sorted[j] < sorted[j + 1]) {
                    temp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                }
            }
        }

        return sorted;
    }
}