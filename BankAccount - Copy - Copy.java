public class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double currentBalance;

    // Constructor
    public BankAccount(int accountNumber, String accountHolder, double currentBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.currentBalance = currentBalance;
    }

    // Getter and Setter methods for account number
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter and Setter methods for account holder
    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Method to return the account holder's name
    public String getAccountHolderName() {
        return accountHolder;
    }

    // Getter and Setter methods for current balance
    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    // Method to deposit funds into the account
    public void deposit(double amount) {
        if (amount > 0) {
            currentBalance += amount;
            System.out.println("Deposited " + amount + " into account " + accountNumber + ". New balance: " + currentBalance);
        } else {
            System.out.println("Deposit amount should be greater than zero.");
        }
    }

    // Method to withdraw funds from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= currentBalance) {
            currentBalance -= amount;
            System.out.println("Withdrew " + amount + " from account " + accountNumber + ". New balance: " + currentBalance);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(123456, "Brian Juma", 1000.0);
        System.out.println("Account holder: " + account.getAccountHolderName());
        account.deposit(500);
        account.withdraw(200);
    }
}
