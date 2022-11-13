import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayOne = {1, 2, 3};
        int[] arrayTwo = {1, 2, 3, 4};
        int[] arrayThree = {1, 2, 3, 4};
        int[] arrayFour = {};
        int[] arrayFive = {1};

        reverse(arrayOne);
        reverse(arrayTwo);
        reverse(arrayThree);
        reverse(arrayFour);
        reverse(arrayFive);
    }

    private static void reverse(int[] intArray) {
        System.out.println("original " + Arrays.toString(intArray));
        int mid = intArray.length / 2;

        for (int i = 0; i < mid; i++) {
            int temp = intArray[i];
            intArray[i] = intArray[intArray.length - 1 - i];
            intArray[intArray.length - 1 - i] = temp;
        }

        System.out.println("reversed " + Arrays.toString(intArray));
    }
}