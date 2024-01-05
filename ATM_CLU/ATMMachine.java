package ATM_CLU;
import java.util.Scanner;
import ATM_CLU.BankAccount;

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
        BankAccount account = new BankAccount();
        ATMMachine atm = new ATMMachine(account); 

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter deposit amount: ");
            double depositAmount = scan.nextDouble();
            atm.deposit(depositAmount);

            System.out.println("Enter withdrawal amount: ");
            double withdrawalAmount = scan.nextDouble();
            atm.withdraw(withdrawalAmount);

            System.out.println("Remaining balance: " + atm.checkBalance());
        }
    }
}
