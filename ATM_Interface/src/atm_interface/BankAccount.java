package atm_interface;

import javax.swing.JOptionPane;

public class BankAccount {
    private double balance;
    
public BankAccount() {
        this.balance = 1000.0;
    }
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount < 0) {    
            JOptionPane.showMessageDialog(null,"Withdrawal amount must be positive");
        }
        else if (amount <= balance) {
            this.balance -= amount;
            JOptionPane.showMessageDialog(null,"Withdaw of R" + amount + " Successfull");
            
        }
    }
    public double getBalance() {
        return this.balance;
    }
    
}