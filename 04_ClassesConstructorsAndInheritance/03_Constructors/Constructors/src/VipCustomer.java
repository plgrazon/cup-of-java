public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    VipCustomer() {
        this("default name", 0.0, "default email");
    }

    VipCustomer(String name, String email) {
        this(name,5000.0, email);
    }

    VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmail() {
        return this.email;
    }
}
