package programmingtwo;

public class CheckingAccount extends BankAccount {

    private double interestRate;

    public CheckingAccount(double interestRate) {
        super();
        this.interestRate = interestRate;
    }

    // Overdraft withdrawal with single $30 fee
    public void processWithdrawal(double amount) {

        double currentBalance = getBalance();

        // Check for overdraft
        if (currentBalance - amount < 0) {
            System.out.println("Insufficient Funds - A $30 fee has been deducted.");

            // Subtract the amount + fee at the same time
            double totalWithdrawal = amount + 30;

            // Apply the combined withdrawal
            withdrawal(totalWithdrawal);

        } else {
            // Normal withdrawal
            withdrawal(amount);
        }

        System.out.println("New Balance: $" + getBalance());
    }

    // Displays account info + interest rate
    public void displayAccount() {
        accountSummary();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}