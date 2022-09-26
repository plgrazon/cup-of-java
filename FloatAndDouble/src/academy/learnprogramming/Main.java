package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println("min float: " + minFloat);
        System.out.println("max float: " + maxFloat);

        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.println("min double: " + minDouble);
        System.out.println("max double: " + maxDouble);

        // will throw an error because double is default;
        // float myFloatWrong = 5.25;
        float myCorrectFloatOne = 5.25F;
        float myCorrectFloatTwo = (float) 5.25;

        int myInt = 5 / 3;
        float myFloat = 5f / 3f;
        double myDouble = 5d / 3d;
        double myDoubleOne = 5.00 / 3.00;
        System.out.println("MyInt = " + myInt);
        System.out.println("MyFloat = " + myFloat);
        System.out.println("MyDouble = " + myDouble);

        double lbs = 200d;
        double kg = lbs * 0.45359237d;
        System.out.println(kg);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}