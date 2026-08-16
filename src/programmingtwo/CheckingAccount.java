package programmingtwo;

public class CheckingAccount extends BankAccount {

    private double interestRate;
    private static final double OVERDRAFT_FEE = 30.0; // UPDATE: Added constant

    public CheckingAccount(double interestRate) {
        super();
        this.interestRate = interestRate;
    }

    // Overdraft withdrawal with single $30 fee
    public void processWithdrawal(double amount) {

        double currentBalance = getBalance();

        if (currentBalance - amount < 0) {
            System.out.println("Insufficient Funds - A $30 fee has been deducted.");

            double totalWithdrawal = amount + OVERDRAFT_FEE;
            withdrawal(totalWithdrawal);

        } else {
            withdrawal(amount);
        }

        System.out.println("New Balance: $" + getBalance());
    }

    // UPDATE: Cleaned up display by using toString()
    public void displayAccount() {
        System.out.println(toString());
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
