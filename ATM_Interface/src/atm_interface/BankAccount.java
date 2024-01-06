package atm_interface;
public class BankAccount {
    private double balance;
    private double depositAmount;
    private double withdrawAmount;

    public BankAccount() {
        this.balance = 1000.0;
    }

    public void BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

     public double getDepositAmount() {
        return depositAmount;
    }
    
    public void deposit(double depositAmount) {
        if(depositAmount > 0) {
             this.balance += depositAmount;
        }
        
    }
     public double getWithdrawAmount() {
        return withdrawAmount;
    }
     
    public void withdraw(double withdrawAmount) {
        if(withdrawAmount > 0 && withdrawAmount <= this.balance) {
            this.balance -= withdrawAmount;
        }
       
    }
}