public class Hamburger {
    private String name = "hamburger";
    private String breadType;
    private String meat;
    private int price = 1;
    private int addOns = 0;
    private boolean lettuce;
    private boolean tomato;
    private boolean carrot;
    private boolean cheese;

    public Hamburger(String breadType, String meat, int price) {
        this.breadType = breadType;
        this.meat = meat;
        this.price = price;
    }

    public Hamburger(String breadType, String meat) {
        this(breadType, meat, 1);
    }

    public Hamburger() {
        this("white", "beef", 1);
    }

    public void setLettuce() {
        this.lettuce = true;
        this.addOns += 1;
    }

    public void setTomato() {
        this.tomato = true;
        this.addOns += 1;
    }

    public void setCarrot() {
        this.carrot = true;
        this.addOns += 1;
    }

    public void setCheese() {
        this.cheese = true;
        this.addOns += 1;
    }

    public void addPrice(int price) {
        this.price += price;
    }

    public int getPrice() {
        return this.price;
    }

    public int getAddOns() {
        return this.addOns;
    }

    public void getTotalPrice() {
        System.out.println(this.name + " order summary");
        System.out.println("base price: " + this.price);
        System.out.println("addons: " + this.addOns);
        System.out.println("total price: " + (this.price + this.addOns));
    }
}
