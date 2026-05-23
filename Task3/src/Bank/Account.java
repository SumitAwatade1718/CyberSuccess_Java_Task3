package Bank;

/**
 * Author: Sumit Vilas Awatade
 * Date: 23-May-2026
 */
public class Account {

    private int id;
    private String name;
    protected double balance;

    // Constructor
    public Account(int id, String name, double balance) {

        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Getter Methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit Method
    public void deposit(double amount) {

        balance = balance + amount;

        System.out.println(amount + " deposited successfully");
    }

    // Withdraw Method
    public void withdraw(double amount)
            throws InvalidBalanceException {

        if(balance - amount < 0) {

            throw new InvalidBalanceException(
                    "Balance cannot be negative");
        }

        balance = balance - amount;

        System.out.println(amount + " withdrawn successfully");
    }

    // Show Balance
    public void showBalance() {

        System.out.println("Balance = " + balance);
    }
}