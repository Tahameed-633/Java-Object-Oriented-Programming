package Package1;
public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(double annualInterestRate, double balance, double overdraftLimit) {
        super(annualInterestRate, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Overdraft Limit: $" + overdraftLimit);
    }
}
