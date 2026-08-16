package programmingtwo;

public class TestBank {

    public static void main(String[] args) {

        // Create CheckingAccount object
        CheckingAccount myAccount = new CheckingAccount(1.5);

        myAccount.setFirstName("Jeff");
        myAccount.setLastName("Crowder");
        myAccount.setAccountID(53332);

        // Deposit money
        myAccount.deposit(-50);
        myAccount.displayAccount();

        // Normal withdrawal
        System.out.println("\nProcessing Request - Withdrawl of $500");
        myAccount.processWithdrawal(0);

        // Overdraft withdrawal
        System.out.println("\nWithdrawing $1500 (overdraft catch test)...");
        myAccount.processWithdrawal(-100);

        // Final account display
        System.out.println("\nFinal Account Status:");
        myAccount.displayAccount();
    }
}