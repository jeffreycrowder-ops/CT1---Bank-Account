package programmingtwo;
// GIT CONNECTION TEST
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BalanceGUI extends JFrame {

    private CheckingAccount account;
    private JTextField amountField;
    private JLabel balanceLabel;

    public BalanceGUI() {

     // Creates the CheckingAccount object
    	account = new CheckingAccount(1.5);
    	
    	// Window settings
    	setTitle("Account Balance Application");
    	setSize(350, 200);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setLayout(new BorderLayout());
    	
    	// Top Panel (Balance)
    	JPanel topPanel = new JPanel();
    	balanceLabel = new JLabel("Current Balance: $" + account.getBalance());
    	topPanel.add(balanceLabel);
    	
    	//Center panel (Amount)
    	JPanel centerPanel = new  JPanel();
    	centerPanel.add(new JLabel("Enter Amount:"));
    	amountField = new JTextField(10);
    	centerPanel.add(amountField);
    	
    	// Bottom Panel (Buttons)
    	JPanel bottomPanel = new JPanel();

        JButton depositButton = new JButton("Deposit");
        depositButton.setBackground(Color.GREEN);

        JButton withdrawButton = new JButton("Withdraw");
        withdrawButton.setBackground(Color.RED);

        JButton showBalanceButton = new JButton("Show Balance");
        showBalanceButton.setBackground(Color.YELLOW);
        
        bottomPanel.add(depositButton);
        bottomPanel.add(withdrawButton);
        bottomPanel.add(showBalanceButton);
        
        //Add Panels to Frame
        add(topPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
    	
        //Action listeners
        depositButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String text = amountField.getText().trim();

                    if (text.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Please enter a dollar amount.");
                        return;
                    }

                    double amount = Double.parseDouble(text);

                    if (amount <= 0) {
                        JOptionPane.showMessageDialog(null, "Dollar amount must be greater than zero.");
                        return;
                    }

                    account.deposit(amount);
                    updateBalance();
                    amountField.setText("");


                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                }
            }
        });


        withdrawButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String text = amountField.getText().trim();

                    if (text.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Please enter a dollar amount.");
                        return;
                    }

                    double amount = Double.parseDouble(text);

                    if (amount <= 0) {
                        JOptionPane.showMessageDialog(null, "Dollar amount must be greater than zero.");
                        return;
                    }

                    account.processWithdrawal(amount);
                    updateBalance();
                    amountField.setText("");


                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                }
            }
        });


        showBalanceButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateBalance();
                JOptionPane.showMessageDialog(null,
                        "Final Balance: $" + account.getBalance(),
                        "Account Balance",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        setVisible(true);
    }

    private void updateBalance() {
        balanceLabel.setText("Current Balance: $" + account.getBalance());
    }

    public static void main(String[] args) {
        new BalanceGUI();
        
    }
    
}