package LAB11;

import java.io.*;
import java.util.*;

class Account implements Serializable {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void transfer(Account recipient, double amount) {
        if (balance >= amount) {
            balance -= amount;
            recipient.deposit(amount);
            System.out.println("Transfer successful");
        } else {
            System.out.println("Insufficient balance for transfer");
        }
    }

    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }
}

public class GLT4 {
    private static final String ACCOUNTS_FILE = "Accounts.ser";

    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();

        // Load existing accounts from the file or create new accounts
        File file = new File(ACCOUNTS_FILE);
        if (file.exists()) {
            accounts = loadAccounts();
        } else {
            accounts = createAccounts();
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("********** ATM System **********");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Transfer");
            System.out.println("4. Balance Inquiry");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            if (choice == 5) {
                break;
            }

            System.out.print("Enter account number: ");
            String accountNumber = scanner.nextLine();

            Account selectedAccount = findAccount(accounts, accountNumber);
            if (selectedAccount == null) {
                System.out.println("Account not found");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline character
                    selectedAccount.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline character
                    selectedAccount.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter recipient account number: ");
                    String recipientAccountNumber = scanner.nextLine();
                    Account recipientAccount = findAccount(accounts, recipientAccountNumber);
                    if (recipientAccount == null) {
                        System.out.println("Recipient account not found");
                        continue;
                    }
                    System.out.print("Enter amount to transfer: ");
                    double transferAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline character
                    selectedAccount.transfer(recipientAccount, transferAmount);
                    break;
                case 4:
                    selectedAccount.displayBalance();
                    break;
                default:
                    System.out.println("Invalid choice");
            }

            // Update the accounts file after each operation
            saveAccounts(accounts);
        }
    }

    public static List<Account> createAccounts() {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("1234567890", "Hasaan Ahmad", 1000.0));
        accounts.add(new Account("0987654321", "Mujtaba", 2000.0));
        accounts.add(new Account("9876543210", "Muhammad Haider", 1500.0));
        accounts.add(new Account("0123456789", "Zohaib", 2500.0));
        accounts.add(new Account("5432109876", "Haris", 3000.0));
        accounts.add(new Account("4567890123", "Abdullah", 3500.0));
        accounts.add(new Account("7890123456", "Mia Zaid", 4000.0));
        accounts.add(new Account("2345678901", "Mohammad Alsalehi", 4500.0));
        accounts.add(new Account("5678901234", "Mohammad Maps", 5000.0));
        accounts.add(new Account("8901234567", "Wajahat", 5500.0));
        return accounts;
    }

    public static void saveAccounts(List<Account> accounts) {
        try {
            FileOutputStream fileOut = new FileOutputStream(ACCOUNTS_FILE);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            for (Account account : accounts) {
                out.writeObject(account);
            }
            out.close();
            fileOut.close();
            System.out.println("Accounts data saved to " + ACCOUNTS_FILE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Account> loadAccounts() {
        List<Account> accounts = new ArrayList<>();
        try {
            FileInputStream fileIn = new FileInputStream(ACCOUNTS_FILE);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            while (true) {
                try {
                    Account account = (Account) in.readObject();
                    accounts.add(account);
                } catch (EOFException e) {
                    break;
                }
            }
            in.close();
            fileIn.close();
            System.out.println("Accounts data loaded from " + ACCOUNTS_FILE);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return accounts;
    }

    public static Account findAccount(List<Account> accounts, String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
}
