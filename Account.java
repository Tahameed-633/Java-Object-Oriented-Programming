package Package1;
import java.util.Random;

class Account {
    protected int id;
    protected double balance;
    protected double annualInterestRate;

    public Account(double annualInterestRate, double balance) {
        this.id = generateId();
        this.annualInterestRate = annualInterestRate;
        this.balance = balance;
    }

    private int generateId() {
        Random random = new Random();
        return random.nextInt(1000);
    }

    public double getMonthlyInterest() {
        return balance * (annualInterestRate / 12);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: $" + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: $" + balance);
    }

    public void showInformation() {
        System.out.println("Account ID: " + id);
        System.out.println("Balance: $" + balance);
        System.out.println("Annual Interest Rate: " + annualInterestRate + "%");
        System.out.println("Monthly Interest: $" + getMonthlyInterest());
    }
}
