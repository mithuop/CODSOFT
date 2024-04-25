import java.util.Scanner;

public class ATM{
    private BankAccount bankAccount;

    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
            return;
        }
        if (amount > bankAccount.getBalance()) {
            System.out.println("Insufficient funds");
            return;
        }
        bankAccount.setBalance(bankAccount.getBalance() - amount);
        System.out.println("Withdrawal successful");
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount");
            return;
        }
        bankAccount.setBalance(bankAccount.getBalance() + amount);
        System.out.println("Deposit successful");
    }

    public double checkBalance() {
        return bankAccount.getBalance();
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); 
        ATM atm = new ATM(account);
        Scanner scanner= new Scanner(System.in);

        int choice = 0;
        while (choice != 4) {
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter withdrawal amount: ");
                double withdrawAmount = scanner.nextDouble();
                atm.withdraw(withdrawAmount);
            } else if (choice == 2) {
                System.out.print("Enter deposit amount: ");
                double depositAmount = scanner.nextDouble();
                atm.deposit(depositAmount);
            } else if (choice == 3) {
                System.out.println("Balance: " + atm.checkBalance());
            } else if (choice == 4) {
                System.out.println("Exiting ATM. Have a nice day!");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
