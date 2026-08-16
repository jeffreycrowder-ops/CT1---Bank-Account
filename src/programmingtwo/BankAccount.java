package programmingtwo;

public class BankAccount {

    private String firstName;
    private String lastName;
    private int accountID;
    private double balance;

    // Constructor initialize balance to zero
    public BankAccount() {
        this.balance = 0.0;
    }

    // UPDATE: Added validation to prevent negative deposits
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
    }

    // UPDATE: Added validation to prevent negative withdrawals
    public void withdrawal(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        balance -= amount;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAccountID() {
        return accountID;
    }

    public double getBalance() {
        return balance;
    }

    // UPDATE: Replaced accountSummary() printing with a toString() method
    @Override
    public String toString() {
        return "Account Summary:\n" +
               "Name: " + firstName + " " + lastName + "\n" +
               "Account ID: " + accountID + "\n" +
               "Balance: $" + balance;
    }
}
