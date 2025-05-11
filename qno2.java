public class qno2 {
    class BankAccount {
        private String accountHolderName;
        private String accountNumber;
        private double balance;

        // Constructor to initialize the account
        public BankAccount(String accountHolderName, String accountNumber, double balance) {
            this.accountHolderName = accountHolderName;
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        // Deposit method
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited $" + amount + ". New balance: $" + balance);
            } else {
                System.out.println("Deposit amount must be positive.");
            }
        }

        // Withdraw method
        public void withdraw(double amount) {
            if (amount > balance) {
                System.out.println("Insufficient funds! Cannot withdraw more than the balance.");
            } else if (amount > 0) {
                balance -= amount;
                System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
            } else {
                System.out.println("Withdrawal amount must be positive.");
            }
        }
    }
}
