public class Main {
    public static void main(String[] args) {
        System.out.println("Hamburger");
        Hamburger hamburger = new Hamburger();
        hamburger.getTotalPrice();

        System.out.println("\nHealthy");
        HealthyBurger healthyBurger = new HealthyBurger();
        healthyBurger.addSalad();
        healthyBurger.addCorn();
        healthyBurger.getTotalPrice();

        System.out.println("\nDeluxe");
        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.getTotalPrice();
        deluxeBurger.setCarrot();
    }
}