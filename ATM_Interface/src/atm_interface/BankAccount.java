package atm_interface;
public class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 1000.0;
    }

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return this.balance;
    }

    public double deposit(double amount) {
        if(amount > 0) {
             this.balance += amount;
        }
        return this.balance;
    }

    public double withdraw(double amount) {
        if(amount > 0 && amount <= this.balance) {
            this.balance -= amount;
        }
        return this.balance;
    }
}