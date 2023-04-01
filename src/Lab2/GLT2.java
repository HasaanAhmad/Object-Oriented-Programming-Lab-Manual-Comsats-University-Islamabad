package LAB2;

class Account {
    double balance;

    public Account(double bal) {
        balance = bal;
    }

    public Account() {
        balance = 5000; // As default, balance= 5000
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void display() {
        System.out.println("The total balance is " + balance);
    }

}

public class GLT2 {
    public static void main(String[] args) {
        Account a1 = new Account(50000);
        Account a2 = new Account();
        a1.display();
        a2.display();
        a2.deposit(5000);
        a2.display();
        a2.withdraw(1000);
        a2.display();
    }

}
