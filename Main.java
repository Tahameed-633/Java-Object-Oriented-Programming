package Package1;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();

        while (true) {
            printMenu();
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    accounts.add(createCheckingAccount(scanner));
                    System.out.println("Checking account created!");
                    break;
                case 2:
                    accounts.add(createSavingsAccount(scanner));
                    System.out.println("Savings account created!");
                    break;
                case 3:
                    showAllAccountInformation(accounts);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("Press (1) for creating a Checking Account");
        System.out.println("Press (2) for creating a Savings Account");
        System.out.println("Press (3) to show all the account information");
        System.out.println("Press (4) to exit");
    }

    private static Account createCheckingAccount(Scanner scanner) {
        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = scanner.nextDouble();
        System.out.print("Enter balance: ");
        double balance = scanner.nextDouble();
        System.out.print("Enter the overdraft limit: ");
        double overdraftLimit = scanner.nextDouble();

        return new CheckingAccount(annualInterestRate, balance, overdraftLimit);
    }

    private static Account createSavingsAccount(Scanner scanner) {
        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = scanner.nextDouble();
        System.out.print("Enter balance: ");
        double balance = scanner.nextDouble();

        return new SavingAccount(annualInterestRate, balance);
    }

    private static void showAllAccountInformation(ArrayList<Account> accounts) {
        if (accounts.isEmpty()) {
            System.out.println("No accounts created yet.");
            return;
        }

        System.out.println("Account Information:");
        for (Account account : accounts) {
            account.showInformation();
        }
    }
}
