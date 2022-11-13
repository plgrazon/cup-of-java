import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue " + myIntValue);
        System.out.println("anotherIntValue " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue " + myIntValue);
        System.out.println("anotherIntValue " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] myAnotherIntArray = myIntArray;

        System.out.println("myIntArray " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray " + Arrays.toString(myAnotherIntArray));

        myAnotherIntArray[0] = 10;

        System.out.println("myIntArray " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray " + Arrays.toString(myAnotherIntArray));

        modifyArray(myIntArray);

        System.out.println("myIntArray " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray " + Arrays.toString(myAnotherIntArray));
    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[] {1, 2, 3, 4, 5};

        System.out.println("new array " + Arrays.toString(array));
    }
}