package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        byte myByte = Byte.MAX_VALUE;
        short myShort = Short.MAX_VALUE;
        int myInt = Integer.MAX_VALUE;
        // option 1
        // this works because we evaluate right to left
        // we cast the int to long then we add the integers
        long myLong = 50000 + 10 * (myByte + myShort + (long) myInt);
        // option 2
        long myLongAgain = 50000 + 10 * ((long) myByte + (long) myShort + (long) myInt);
        short myNewShort = (short) (10000 + (10 * (myByte + myShort + myInt)));
        System.out.println(myLong);
        System.out.println(myNewShort);
    }
}