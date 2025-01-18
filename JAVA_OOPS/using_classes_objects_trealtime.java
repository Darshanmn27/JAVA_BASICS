import java.util.*;

class atm {
    private double balance;

    public atm(double intial_balance) {
        this.balance = intial_balance;
    }

    // method to check the balance
    public void check_balance() {
        System.out.println(" current  balance :$ " + balance);
    }

    // method to withdraw the money

    public void withdraw_money(double amount) {
        if (amount > balance) {
            System.out.println("insufficient   balance !  cannot   withdraw $" + amount);
        } else if (amount <= 0) {
            System.out.println("  in valid    withdrawal amount");
        } else {
            balance = balance - amount;
            System.out.println("   succesfully   withdrwa   amount  $" + amount);
            check_balance();
        }
    }
    // method to deposi money

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("   in valid  deposit  amount");
        } else {
            balance = balance + amount;
            System.out.println("   succesfully  deposited $" + amount);
            check_balance();
        }
    }
}

public class using_classes_objects_trealtime {

    public static void main(String[] args) {
        atm a = new atm(1000);
        Scanner s = new Scanner(System.in);
        int choice;
        do {
            System.out.println("welcome  to  the  atm!");
            System.err.println("1, check balance");
            System.err.println("2, withdraw money");
            System.err.println("3, deposit money");
            System.err.println("4, exit");
            System.out.println("  enter  your   choice :");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    a.check_balance();
                    break;
                case 2:
                    System.out.println("  enter    amount   to  withdraw: $");
                    double withdraw = s.nextDouble();
                    a.withdraw_money(withdraw);// withdraw money
                    break;
                case 3:
                    System.out.println("  enter  amount  to  deposit :$");

                    double deposit = s.nextDouble();
                    a.deposit(deposit);
                    break;
                case 4:
                    System.out.println("  thank  you   for   using  atm good bye!.");
                    break;
                default:
                    System.out.println("  invalid   choice!  please   try  again");
            }
        } while (choice != 4);
        s.close();
    }

}
