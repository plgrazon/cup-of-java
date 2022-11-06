public class Printer {
    private int tonerLevel = 100;
    private int pagesPrinted = 0;
    private boolean duplex = false;

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public void fillToner(int toner) {
        if (this.tonerLevel < 100) {
            if ((this.tonerLevel + toner) > 100) {
                System.out.println("Too much toner input, needed is: " + (100 - this.tonerLevel) + "%");
            } else {
                this.tonerLevel += toner;
                System.out.println("Toner level is at " + this.tonerLevel + "%");
            }
        } else {
            System.out.println("Toner is full");
        }
    }

    public void printPage(int pages) {
        if (pages == 0) {
            System.out.println("No document was printed");
        } else {
            for (int i = 0; i < pages; i++) {
                this.pagesPrinted++;
                this.tonerLevel--;
                System.out.println("Printing page(s): " + (i + 1));
            }
        }
    }
}
