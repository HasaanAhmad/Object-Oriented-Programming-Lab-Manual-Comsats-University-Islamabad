package LAB3;

public class GLT2 {
    public static void main(String[] args) {
        Account a1 = new Account(10000);
        System.out.println(a1.toString());
        a1.withdrawBalance(500);
        System.out.println(a1.toString());
        a1.depositBalance(1000);
        System.out.println(a1.toString());
        Account a2 = new Account(a1.getBalance());
        System.out.println(a2.toString());
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

    @Override
    public String toString() {
        return "Account [balance=" + balance + "]";
    }

}
