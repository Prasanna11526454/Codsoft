import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance. Try to enter withdrawal amount less than Bank Balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: Rs. " + balance);

        }
    }
}

class ATM {
    private BankAccount bankaccount;

    public ATM(BankAccount bankaccount) {
        this.bankaccount = bankaccount;
    }

    public void displayMenu() {
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void operationtoperform(int option, Scanner sc) {
        switch (option) {
            case 1:
                System.out.print("Enter withdrawal amount: Rs. ");
                double withdrawAmount = sc.nextDouble();
                bankaccount.withdraw(withdrawAmount);
                break;
            case 2:
                System.out.print("Enter deposit amount: Rs. ");
                double depositAmount = sc.nextDouble();
                bankaccount.deposit(depositAmount);
                System.out.println("Deposit successful. Updated balance: Rs. " + bankaccount.getBalance());
                break;
            case 3:
                System.out.println("Current balance: Rs. " + bankaccount.getBalance());
                break;
            case 4:
                System.out.println(" Thank you for using ATM!! ");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option. Please select a valid option.");
        }
    }
}

public class ATMInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount(2000);
        ATM atm = new ATM(bankAccount);
        while (true) {
            atm.displayMenu();
            System.out.print("Enter your choice (1-4): ");
            int option = sc.nextInt();
            atm.operationtoperform(option, sc);
        }
    }
}
