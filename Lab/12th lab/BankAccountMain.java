
class BankAccount {
    private double balance;
    
    
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    
   
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }
    
        public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }
    
        public double getBalance() {
        return balance;
    }
}


class SavingsAccount extends BankAccount {
    private static final double WITHDRAWAL_LIMIT = 500; 
    
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }
    
    
    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance() && amount <= WITHDRAWAL_LIMIT) {
            super.withdraw(amount);
            System.out.println("Withdrawal limit for savings account: $" + WITHDRAWAL_LIMIT);
        } else if (amount > WITHDRAWAL_LIMIT) {
            System.out.println("Exceeded withdrawal limit for savings account");
        } else {
            System.out.println("Insufficient funds");
        }
    }
}


class CheckingAccount extends BankAccount {
    private static final double WITHDRAWAL_FEE = 1.5; 
    
    
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }
    
    
    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            super.withdraw(amount + WITHDRAWAL_FEE);
            System.out.println("Withdrawal fee for checking account: $" + WITHDRAWAL_FEE);
        } else {
            System.out.println("Insufficient funds");
        }
    }
}


public class BankAccountMain {
    public static void main(String[] args) {
        
        SavingsAccount savingsAccount = new SavingsAccount(1000);
        CheckingAccount checkingAccount = new CheckingAccount(1500);
        
        System.out.println("Initial balance of savings account: $" + savingsAccount.getBalance());
        savingsAccount.withdraw(400);
        System.out.println("Current balance of savings account: $" + savingsAccount.getBalance());
        
        System.out.println("\nInitial balance of checking account: $" + checkingAccount.getBalance());
        checkingAccount.withdraw(400);
        System.out.println("Current balance of checking account: $" + checkingAccount.getBalance());
    }
}
