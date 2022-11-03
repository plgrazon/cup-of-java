public class Main {
    public static void main(String[] args) {
        LivingRoom myLivingRoom = new LivingRoom(1, 1, 1);
        Kitchen myKitchen = new Kitchen(1, 1, 1, 1);
        Room myRoom = new Room(1, 1, 1, "Bob");

        House myHouse = new House(myLivingRoom, myKitchen, myRoom);
        // using getters
        myHouse.getLivingRoom().relax();
        myHouse.getKitchen().cook();
        myHouse.getRoom().sleep();
        // using methods in parent to abstract
        myHouse.relax();
        myHouse.cook();
        myHouse.sleep();
    }
}