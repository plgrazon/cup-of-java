public class Room {
    private int bed;
    private int table;
    private int lights;
    private String assignedPerson;

    public Room(int bed, int table, int lights, String assignedPerson) {
        this.bed = bed;
        this.table = table;
        this.lights = lights;
        this.assignedPerson = assignedPerson;
    }

    public Room() {
        this(1, 2, 1, "none");
    }

    public void sleep() {
        if (this.assignedPerson == "none") {
            System.out.println("No person assigned cannot sleep");
        } else {
            System.out.println(this.assignedPerson + " is sleeping");
        }
    }

    public int getBed() {
        return bed;
    }

    public int getTable() {
        return table;
    }

    public int getLights() {
        return lights;
    }

    public String getAssignedPerson() {
        return assignedPerson;
    }
}
