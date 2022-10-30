public class Vehicle {
    private String type;
    private String name;
    private int direction;
    private int speed;

    public Vehicle(String type, String name) {
        this.type = type;
        this.name = name;
        this.direction = 0;
        this.speed = 0;
    }

    public void move(int speed) {
        this.speed += speed;
        System.out.println("Vehicle moving at " + this.speed + "mph");
    }

    public void steer(int direction) {
        this.direction += direction;
        System.out.println("Vehicle steering at " + this.direction + "degrees");
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getDirection() {
        return direction;
    }

    public int getSpeed() {
        return speed;
    }
}
