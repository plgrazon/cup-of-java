public class Main {
    public static void main(String[] args) {
        String numberAsString = "2018";
        String doubleAsString = "10.88";

        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        double doubleNum = Double.parseDouble(doubleAsString);
        System.out.println("number = " + number);
        System.out.println("double = " + doubleNum);

        numberAsString += 1;
        number += 1;
        doubleNum += 38.99;

        System.out.println("string " + numberAsString + " int " + number);
        System.out.println("double sum " +  String.format("%.2f", doubleNum));
    }
}