public class Kitchen {
    private int stove;
    private int oven;
    private int microwave;
    private int refrigerator;

    public Kitchen(int stove, int oven, int microwave, int refrigerator) {
        this.stove = stove;
        this.oven = oven;
        this.microwave = microwave;
        this.refrigerator = refrigerator;
    }

    public Kitchen() {
        this(1, 1, 1, 1);
    }

    public void cook() {
        System.out.println(this.stove + " stove is being used now");
    }

    public int getStove() {
        return stove;
    }

    public int getOven() {
        return oven;
    }

    public int getMicrowave() {
        return microwave;
    }

    public int getRefrigerator() {
        return refrigerator;
    }
}
