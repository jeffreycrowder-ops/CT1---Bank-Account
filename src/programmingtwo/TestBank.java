package programmingtwo;
// TEST COMMENT FOR VERSION CONTROL TEST!!
public class TestBank {

    public static void main(String[] args) {

        // Create CheckingAccount object
        CheckingAccount myAccount = new CheckingAccount(1.5);

        myAccount.setFirstName("Jeff");
        myAccount.setLastName("Crowder");
        myAccount.setAccountID(53332);

        // Deposit money
        myAccount.deposit(1300);
        myAccount.displayAccount();

        // Normal withdrawal
        System.out.println("\nProcessing Request - Withdrawl of $500");
        myAccount.processWithdrawal(500);

        // Overdraft withdrawal
        System.out.println("\nWithdrawing $1500 (overdraft catch test)...");
        myAccount.processWithdrawal(1500);

        // Final account display
        System.out.println("\nFinal Account Status:");
        myAccount.displayAccount();
    }
}