public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        System.out.println(printer.getPagesPrinted());
        System.out.println(printer.getTonerLevel());

        printer.printPage(0);
        printer.printPage(1);
        printer.printPage(10);

        System.out.println(printer.getPagesPrinted());
        System.out.println(printer.getTonerLevel());
    }
}