public class House {
    LivingRoom livingRoom;
    Kitchen kitchen;
    Room room;

    public House(LivingRoom livingRoom, Kitchen kitchen, Room room) {
        this.livingRoom = livingRoom;
        this.kitchen = kitchen;
        this.room = room;
    }

    public void relax() {
        this.livingRoom.relax();
    }

    public void cook() {
        this.kitchen.cook();
    }

    public void sleep() {
        this.room.sleep();
    }

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public Room getRoom() {
        return room;
    }
}
