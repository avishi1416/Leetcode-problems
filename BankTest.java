interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
    void checkBalance();
}

class SavingsAccount implements BankAccount {

    double bal;
    final double MIN_BALANCE = 1000;

    SavingsAccount(double balance) {
        this.bal = balance;
    }

    public void deposit(double amount) {
        bal+= amount;
        System.out.println("Deposited:" + amount);
    }

    public void withdraw(double amount) {
        if (bal - amount >= MIN_BALANCE) {
            bal-= amount;
            System.out.println("Withdrawn:" + amount);
        } else {
            System.out.println("Minimum balance ₹1000 required.");
        }
    }

    public void checkBalance() {
        System.out.println("Savings Balance:" + bal);
    }
}

class CurrentAccount implements BankAccount {

    double balance;
    double OVERDRAFT_LIMIT = -5000;

    CurrentAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited:" + amount);
    }

    public void withdraw(double amount) {
        if (balance - amount >= OVERDRAFT_LIMIT) {
            balance -= amount;
            System.out.println("Withdrawn:" + amount);
        } else {
            System.out.println("Max ₹5000 allowed.");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance:" + balance);
    }
}

public class BankTest {

    public static void main(String[] args) {

        BankAccount savings = new SavingsAccount(5000);
        BankAccount current = new CurrentAccount(2000);

        System.out.println("Savings Account");
        savings.deposit(2000);
        savings.withdraw(5500);
        savings.checkBalance();

        System.out.println(" Current Account");
        current.withdraw(6000);
        current.deposit(3000);
        current.checkBalance();
    }
}
