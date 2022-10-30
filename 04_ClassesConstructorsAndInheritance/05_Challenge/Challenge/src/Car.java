public class Car extends Vehicle {
    private int doors;
    private int tires;
    private int gears;
    private int currentGear;
    private boolean isManual;

    public Car(String type, String name, int doors, int tires, int gears, boolean isManual) {
        super(type, name);
        this.doors = doors;
        this.tires = tires;
        this.gears = gears;
        this.currentGear = 1;
        this.isManual = isManual;
    }

    public void setGear(int gear) {
        this.currentGear = gear;
        System.out.println("Car changing gear to " + this.currentGear);
    }
}
