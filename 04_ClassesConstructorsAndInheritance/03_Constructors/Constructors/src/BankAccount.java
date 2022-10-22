public class BankAccount {
    private int number;
    private double balance = 0;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount() {
        this(000000, 0.0, "Default", "Default", 0000000);
        System.out.println("Empty constructor called");
    }

    public BankAccount(int number, double balance, String customerName, String email, int phoneNumber) {
        System.out.println("Constructor called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double amount) {
        System.out.println("Previous balance: " + String.format("%.2f", this.balance));
        this.balance += amount;
        System.out.println("After balance: " + String.format("%.2f", this.balance));
    }

    public void withdrawFunds(double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient funds");
        } else {
            this.balance -= amount;
            System.out.println("New balance is: " + String.format("%.2f",this.balance));
        }
    }
}
