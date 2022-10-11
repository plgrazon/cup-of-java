public class Main {
    public static void main(String[] args) {
        int value = 1;

        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 4;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("was a 3, or a 4, or a 5");
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char test = 'D';

        switch (test) {
            case 'A':
                System.out.println("Aa");
                break;
            case 'B':
                System.out.println("Bb");
                break;
            case 'C':
                System.out.println("Cc");
                break;
            case 'D':
                System.out.println("Dd");
                break;
            case 'E':
                System.out.println("Ee");
                break;
            default:
                System.out.println("Not Found");
                break;
        }

        String month = "January";

        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
        }
    }

}