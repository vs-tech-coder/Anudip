// Parent class representing a bank account
class Bank1 {
    protected double balance; // Balance of the account

    public Bank1(double initialBalance) {
        this.balance = initialBalance;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount; // Add the amount to the balance
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }


    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount; // Deduct the amount from the balance
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }


    public double getBalance() {
        return balance;
    }
}

// Subclass representing a savings account
class SavingsAccount extends Bank1 {
    private static final double WITHDRAWAL_LIMIT = 1000.00; // Withdrawal limit for savings account

    // Constructor to initialize balance for savings account
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    // Overridden method to withdraw money from savings account
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance && amount <= WITHDRAWAL_LIMIT) {
            balance -= amount; // Deduct the amount from the balance
            System.out.println("Withdrew: $" + amount + " from Savings Account");
        } else {
            System.out.println("Withdrawal amount exceeds the limit or insufficient funds.");
        }
    }
}

// Subclass representing a checking account
class CheckingAccount extends Bank1 {
    private static final double WITHDRAWAL_FEE = 2.50; // Withdrawal fee for checking account

    // Constructor to initialize balance for checking account
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    // Overridden method to withdraw money from checking account
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (amount + WITHDRAWAL_FEE) <= balance) {
            balance -= (amount + WITHDRAWAL_FEE); // Deduct the amount with withdrawal fee from the balance
            System.out.println("Withdrew: $" + amount + " from Checking Account with a fee of $" + WITHDRAWAL_FEE);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
}

// Main class to test bank accounts
public class BankAccount {
    public static void main(String[] args) {
        // Creating instances of SavingsAccount and CheckingAccount
        SavingsAccount savings = new SavingsAccount(2000.00);
        CheckingAccount checking = new CheckingAccount(1500.00);

        // Testing deposit
        savings.deposit(500.00);
        checking.deposit(300.00);

        // Testing withdraw with SavingsAccount
        savings.withdraw(500.00);
        savings.withdraw(1500.00);

        // Testing withdraw with CheckingAccount
        checking.withdraw(100.00);
        checking.withdraw(2000.00);

        // Printing final balances
        System.out.println("Savings Account Balance: $" + savings.getBalance());
        System.out.println("Checking Account Balance: $" + checking.getBalance());
    }
}
