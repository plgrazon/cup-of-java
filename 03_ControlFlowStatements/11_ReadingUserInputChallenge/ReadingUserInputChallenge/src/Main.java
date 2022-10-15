import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int sum = 0;
         int numCount = 1;

         while (numCount <= 10) {
             System.out.println("Enter number #" + numCount);

             if (scanner.hasNextInt()) {
                 sum += scanner.nextInt();
                 numCount++;
             } else {
                 System.out.println("Invalid input try again");
             }
             scanner.nextLine();
         }

         System.out.println("sum: " + sum);
         scanner.close();
    }
}