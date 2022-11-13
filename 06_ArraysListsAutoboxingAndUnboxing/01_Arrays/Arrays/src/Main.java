import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myFirstArray = new int[10];
        myFirstArray[5] = 50;
        System.out.println(myFirstArray[5]);

        int[] mySecondArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(mySecondArray[5]);

        int[] myThirdArray = new int[10];

        for (int i = 0; i < myThirdArray.length; i++) {
            myThirdArray[i] = i * 10;
        }

        System.out.println(myThirdArray[1]);
        System.out.println(myThirdArray[3]);
        System.out.println(myThirdArray[5]);
        System.out.println(myThirdArray[7]);
        System.out.println(myThirdArray[9]);

        printArray(myThirdArray);

        double[] myDoubleArray = new double[10];

        // scanner exercise
        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        System.out.println(getAverage(myIntegers));
    }

    public static int[] getIntegers(int length) {
        System.out.println("Enter " + length + " values.\r");
        int[] values = new int[length];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        scanner.close();

        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (double) sum / array.length;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("from method: " + array[i]);
        }
    }
}