import java.util.*;

class Atm {
    private double balance;
    private final int pin; // PIN for security

    // Constructor to initialize balance and PIN
    public Atm(double initialBalance, int pin) {
        this.balance = initialBalance;
        this.pin = pin;
    }

    // Method to check the balance
    public void checkBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    // Method to withdraw money
    public void withdrawMoney(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance! Cannot withdraw $" + amount);
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else {
            balance -= amount;
            System.out.println("Successfully withdrew $" + amount);
            checkBalance();
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount!");
        } else {
            balance += amount;
            System.out.println("Successfully deposited $" + amount);
            checkBalance();
        }
    }

    // Method to verify PIN
    public boolean verifyPin(int inputPin) {
        return this.pin == inputPin;
    }
}

public class UsingClassesObjectsRealtime {
    public static void main(String[] args) {
        // Create an ATM object with an initial balance and a PIN
        Atm atm = new Atm(1000, 1234); // Example: PIN is 1234
        Scanner scanner = new Scanner(System.in);

        // PIN verification
        System.out.println("Welcome to the ATM!");
        System.out.print("Please enter your 4-digit PIN: ");
        int enteredPin = scanner.nextInt();
        int attempts = 0;

        // Allow up to 3 attempts to enter the correct PIN
        while (!atm.verifyPin(enteredPin) && attempts < 2) {
            attempts++;
            System.out.println("Incorrect PIN. Please try again.");
            System.out.print("Enter your PIN: ");
            enteredPin = scanner.nextInt();
        }

        // Check if the user is locked out
        if (!atm.verifyPin(enteredPin)) {
            System.out.println("Too many incorrect attempts. Your account is locked. Goodbye!");
            scanner.close();
            return; // Exit the program
        }

        System.out.println("PIN verified successfully!");
        int choice;

        // Menu-driven program
        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance(); // Check balance
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdrawMoney(withdrawAmount); // Withdraw money
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount); // Deposit money
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        scanner.close(); // Close the scanner
    }
}
