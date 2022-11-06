public class HealthyBurger extends  Hamburger {
    private boolean salad;
    private boolean corn;

    public HealthyBurger() {
        super("brown rye", "chicken");
    }

    public HealthyBurger(String meat) {
        super("brown rye", meat);
    }

    public void addSalad() {
        this.salad = true;
        super.addPrice(1);
    }

    public void addCorn() {
        this.corn = true;
        super.addPrice(1);
    }
}
