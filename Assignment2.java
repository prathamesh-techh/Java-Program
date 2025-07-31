import java.util.Scanner;

class BankAccount {
    String accountHolderName;
    int accountNumber;
    int balance;

    public BankAccount(String accountHolderName, int accountNumber, int balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getters and Setters
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String name) {
        this.accountHolderName = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int number) {
        this.accountNumber = number;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // Deposit method
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
}

class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input account details
        System.out.println("Enter Account Holder Name:");
        String name = scanner.nextLine();

        System.out.println("Enter Account Number:");
        int accNum = scanner.nextInt();

        System.out.print("Enter Initial Balance: ");
        int initBalance = scanner.nextInt();

        // Create account
        BankAccount account = new BankAccount(name, accNum, initBalance);

        // Perform deposit
        System.out.print("Enter amount to deposit: ");
        int depositAmount = scanner.nextInt();
        account.deposit(depositAmount);

        // Perform withdrawal
        System.out.print("Enter amount to withdraw: ");
        int withdrawAmount = scanner.nextInt();
        account.withdraw(withdrawAmount);

        // Get balance
        int currentBalance = account.getBalance();
        System.out.println("Current Balance: " + currentBalance);

        // Use ternary operator to check minimum balance status
        String status = (currentBalance >= 5000) ? "Minimum Balance Maintained" : "Minimum Balance not Maintained";
        System.out.println("Status: " + status);

        scanner.close();
    }
}