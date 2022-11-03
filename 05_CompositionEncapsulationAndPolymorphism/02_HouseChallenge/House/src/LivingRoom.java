public class LivingRoom {
    private int table;
    private int sofa;
    private int tv;

    public LivingRoom(int table, int sofa, int tv) {
        this.table = table;
        this.sofa = sofa;
        this.tv = tv;
    }

    public void relax() {
        if (tv < 1) {
            System.out.println(this.sofa + " sofa is being used");
        } else {
            System.out.println(this.tv + " tv is being used");
        }
    }

    public LivingRoom() {
        this(1, 1, 1);
    }

    public int getTable() {
        return table;
    }

    public int getSofa() {
        return sofa;
    }

    public int getTv() {
        return tv;
    }
}
