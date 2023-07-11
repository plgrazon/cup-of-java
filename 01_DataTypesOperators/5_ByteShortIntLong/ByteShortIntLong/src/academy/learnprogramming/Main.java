package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {

       int myValue = 10000;

       int myMinIntValue = Integer.MIN_VALUE;
       int myMaxIntValue = Integer.MAX_VALUE;

       System.out. println("Integer Minimum Value = " + myMinIntValue);
       System.out.println("Integer Maximum Value = " + myMaxIntValue);
       System.out.println("Busted Max = " + (myMaxIntValue + 1));
       System.out.println("Busted Min = " + (myMinIntValue - 1));

       int myMaxIntTest = 2147483647;
       int myMaxIntTestWithUnderScore = 2_147_483_647;

       byte myMinByteValue = Byte.MIN_VALUE;
       byte myMaxByteValue = Byte.MAX_VALUE;
       System.out.println("Byte Minimum Value = " + myMinByteValue);
       System.out.println("Byte Max Value = " + myMaxByteValue);

       short myMinShortValue = Short.MIN_VALUE;
       short myMaxShortValue = Short.MAX_VALUE;
       System.out.println("Short Minimum Value = " + myMinShortValue);
       System.out.println("Short Max Value = " + myMaxShortValue);

       long myLongValue = 100;
       // this works because the long literal value fits the int datatype

       long myMinLongValue = Long.MIN_VALUE;
       long myMaxLongValue = Long.MAX_VALUE;
       System.out.println("Long Minimum Value = " + myMinLongValue);
       System.out.println("Long Max Value = " + myMaxLongValue);
       long bigLongLiteralValue = 2_147_483_647_234L;
       System.out.println(bigLongLiteralValue);
       // this won't work without L because the number is bigger than int

       short bigShortLiteralValue = 32767;

       int myTotal = (myMinIntValue / 2);

       byte myNewByteValueError = (myMinByteValue / 2);
       // the reason why we're getting an error here is because the 2 int the expression is an int not a byte
       byte myNewByteValue = (byte) (myMinByteValue / 2);

       short myNewShortValue = (short) (myMinShortValue / 2);
    }
}
