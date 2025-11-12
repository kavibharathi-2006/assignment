class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // Check balance
    public void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}

// Demonstration
public class ATMSystem {
    public static void main(String[] args) {
        Account acc1 = new Account("12345", "Varun", 5000);
        acc1.checkBalance();
        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc1.checkBalance();
    }
}
