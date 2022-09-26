package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        // backslash u is need to denote we're entering a number
        // unicode can be used unicode-table.com to get unicode numbers
        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        boolean myTrue = true;
        boolean myFalse = false;
        System.out.println(myTrue);
        System.out.println(myFalse);

        int age = 18;
        boolean isCustomerOver21 = age > 21;
        System.out.println(isCustomerOver21);
    }
}