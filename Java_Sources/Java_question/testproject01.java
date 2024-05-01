package Java_question;

abstract class Account {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    // Abstract methods
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double interestRate) {
        super(accountNumber);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount + (amount * interestRate);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

class CheckingAccount extends Account {
    private double transactionFee;

    public CheckingAccount(String accountNumber, double transactionFee) {
        super(accountNumber);
        this.transactionFee = transactionFee;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= (amount + transactionFee)) {
            balance -= (amount + transactionFee);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

public class testproject01 {
    public static void main(String[] args) {
        // Creating instances of accounts
        SavingsAccount savingsAccount = new SavingsAccount("SA001", 0.05);
        CheckingAccount checkingAccount = new CheckingAccount("CA001", 1.0);

        // Depositing and withdrawing from savings account
        savingsAccount.deposit(1000);
        savingsAccount.withdraw(200);

        // Depositing and withdrawing from checking account
        checkingAccount.deposit(500);
        checkingAccount.withdraw(100);

        // Printing balances
        System.out.println("Savings Account Balance: $" + savingsAccount.getBalance());
        System.out.println("Checking Account Balance: $" + checkingAccount.getBalance());
    }
}
