public class DeluxeBurger extends Hamburger {
    private boolean chips = true;
    private boolean drinks = true;

    public DeluxeBurger() {
        super("regular", "beef", 5);
        super.setLettuce();
        super.setTomato();
        super.setCarrot();
        super.setCheese();
    }

    @Override
    public void setLettuce() {
        System.out.println("addons is already added to the deluxe burger");
    }

    @Override
    public void setTomato() {
        System.out.println("addons is already added to the deluxe burger");
    }

    @Override
    public void setCarrot() {
        System.out.println("addons is already added to the deluxe burger");
    }

    @Override
    public void setCheese() {
        System.out.println("addons is already added to the deluxe burger");
    }
}
