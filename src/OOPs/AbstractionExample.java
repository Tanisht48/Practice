package OOPs;

abstract class BankAccount {
    protected double balance;
    protected String accountType;

    public BankAccount(double initialBalance, String accountType) {
        this.balance = initialBalance;
        this.accountType = accountType;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public abstract String getAccountType();
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialBalance) {
        super(initialBalance, "Savings Account");
    }

    public String getAccountType() {
        return accountType;
    }
}

class CheckingAccount extends BankAccount {
    public CheckingAccount(double initialBalance) {
        super(initialBalance, "Checking Account");
    }

    public String getAccountType() {
        return accountType;
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount(1000.0);
        BankAccount checkingAccount = new CheckingAccount(1500.0);

        savingsAccount.deposit(500.0);
        savingsAccount.withdraw(200.0);

        checkingAccount.deposit(800.0);
        checkingAccount.withdraw(300.0);

        System.out.println("Savings Account Type: " + savingsAccount.getAccountType());
        System.out.println("Savings Account Balance: $" + savingsAccount.balance);

        System.out.println("Checking Account Type: " + checkingAccount.getAccountType());
        System.out.println("Checking Account Balance: $" + checkingAccount.balance);
    }
}
