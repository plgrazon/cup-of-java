public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(12,15,24);

        Case theCase = new Case("220B", "Dell", "240", dimensions);
        Monitor theMonitor = new Monitor("27inch wide", "Acer", 27, new Resolution(2540, 1440));
        Motherboard theMotherboard = new Motherboard("x7", "Asus", 4, 6, "v1");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);

        // one way to do it
        // thePC.getMonitor().drawPixelAt(10,10, "red");
        // thePC.getMotherboard().loadProgram("Windows 11");
        // thePC.getTheCase().pressPowerButton();

        // another by abstracting more
        thePC.powerUp();
    }
}