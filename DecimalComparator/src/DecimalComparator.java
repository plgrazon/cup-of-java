public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double numOne, double numTwo) {
        int numOneWhole = (int) (numOne * 1000);
        int numTwoWhole = (int) (numTwo * 1000);
        System.out.println(numOneWhole + " " + numTwoWhole);

        return numOneWhole == numTwoWhole;
    }
}
