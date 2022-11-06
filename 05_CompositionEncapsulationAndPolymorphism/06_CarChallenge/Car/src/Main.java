class Car {
    private String name;
    private String engine;
    private int cylinders;
    private int wheels;

    public Car() {
        this("car", 4, "gas", 4);
    }

    public Car(String name, int cylinders, String engine, int wheels) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = engine;
        this.wheels = wheels;
    }

    public String makeSound() {
        return "vroom vroom";
    }

    public String getName() {
        return this.name;
    }
}

class FastCar extends Car {
    public FastCar() {
        super("fast car", 8, "gas", 4);
    }

    @Override
    public String makeSound() {
        return "zoom zoom";
    }
}

class DriftCar extends Car {
    public DriftCar() {
        super("drift car", 6, "gas", 4);
    }

    @Override
    public String makeSound() {
        return "skkkrrrrt skkkrrrrt";
    }
}

public class Main {
    public static void main(String[] args) {
        Car regularCar = new Car();
        System.out.println(regularCar.makeSound());
        System.out.println(regularCar.getName());
        System.out.println("\n");

        Car fastCar = new FastCar();
        System.out.println(fastCar.makeSound());
        System.out.println(fastCar.getName());
        System.out.println("\n");

        Car driftCar = new DriftCar();
        System.out.println(driftCar.makeSound());
        System.out.println(driftCar.getName());
    }
}