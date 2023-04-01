package Lab3;

public class GLT2 {
    public static void main(String[] args) {
        Account a1 = new Account(10000);
        a1.displayBalance();
        a1.withdrawBalance(500);
        a1.displayBalance();
        a1.depositBalance(1000);
        a1.displayBalance();
        Account a2 = new Account(a1.getBalance());
        a2.displayBalance();
    }

}

class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public Account() {
        balance = 0;
    }

    void withdrawBalance(int amount) {
        balance -= amount;
    }

    void depositBalance(int amount) {
        balance += amount;
    }

    void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    };

}
