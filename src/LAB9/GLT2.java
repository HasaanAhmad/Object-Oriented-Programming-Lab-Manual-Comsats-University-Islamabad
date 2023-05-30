package LAB9;

interface Payable {
    Double getPaymentAmount();
}

class Invoice implements Payable {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice() {
        partNumber = null;
        partDescription = null;
        quantity = 0;
        pricePerItem = 0;
    }

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    @Override
    public Double getPaymentAmount() {
        return quantity * pricePerItem;
    }
}

class Employee implements Payable {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee() {
        firstName = null;
        lastName = null;
        socialSecurityNumber = null;
    }

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public Double getPaymentAmount() {
        return null;
    }
}

class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee() {
        weeklySalary = 0;
    }

    public SalariedEmployee(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public Double getPaymentAmount() {
        return weeklySalary;
    }
}

public class GLT2 {
    public static void main(String[] args) {
        Payable[] payableObjects = new Payable[4];
        payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
        payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
        payableObjects[2] = new SalariedEmployee("Hasaan", "Ahmad", "111-11-1111", 800.00);
        payableObjects[3] = new SalariedEmployee("Mujtaba", "", "888-88-8888", 1200.00);
        System.out.println("Invoices and Employees processed polymorphically:");
        for (Payable currentPayable : payableObjects) {
            System.out.printf("%n%s %n%s: $%,.2f%n", currentPayable.toString(), "payment due",
                    currentPayable.getPaymentAmount());
        }
    }

}