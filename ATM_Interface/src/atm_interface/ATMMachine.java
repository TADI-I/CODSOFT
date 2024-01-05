package atm_interface;

public class ATMMachine {
    private BankAccount account;

    public ATMMachine(BankAccount account) {
        this.account = account;
    }

    public double deposit(double amount) {
        if (amount < 0) {
            System.out.println("Deposit amount must be positive");
            return account.getBalance();
        }
        account.deposit(amount);
        return account.getBalance();
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Withdrawal amount must be positive");
            return;
        }
        if (amount <= account.getBalance()) {
            account.withdraw(amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double checkBalance() {
        return account.getBalance();
    }

    @Override
    public String toString() {
        return "Balance: " + account.getBalance();
    }

    public static void main(String[] args) {
       // BankAccount account = new BankAccount(1000.0);
        //ATMMachine atm = new ATMMachine(account);
        //atm.deposit(500.0);
        //atm.withdraw(200.0);
        //System.out.println(atm.checkBalance());  // Outputs: 1300.0
    }
}