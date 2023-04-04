
package LAB6;
/*
The Person, Student, Employee, Faculty, and Staff classes)
Design a class named Person and its two subclasses named Student and Employee. Design two more 
classes; Faculty and Staff and extend them from Employee. The detail of classes is as under:
A person has a name, address, phone number, and email address.
A student has a status (String)
An employee has an office, salary, and date hired. Use the Date class to create an object for date hired.
A faculty member has office hours and a rank.
A staff member has a title.
Create display method in each class
 */

class Person {
    protected String name;
    protected String address;
    protected String phone;
    protected String email;

    public Person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
    }
}

class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date(String string) {
    }

    void display() {
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }
}

class Student extends Person {
    private String status;

    public Student(String name, String address, String phone, String email, String status) {
        super(name, address, phone, email);
        this.status = status;
    }

    void display() {
        super.display();
        System.out.println("Status: " + status);
    }
}

class Employee extends Person {
    private String office;
    private int salary;
    private Date dateHired;

    public Employee(String name, String address, String phone, String email, String office, int salary,
            Date dateHired) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    void display() {
        super.display();
        System.out.println("Office: " + office);
        System.out.println("Salary: " + salary);
        dateHired.display();
    }
}

class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phone, String email, String office, int salary, Date dateHired,
            String officeHours, String rank) {
        super(name, address, phone, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    void display() {
        super.display();
        System.out.println("Office Hours: " + officeHours);
        System.out.println("Rank: " + rank);
    }
}

class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phone, String email, String office, int salary, Date dateHired,
            String title) {
        super(name, address, phone, email, office, salary, dateHired);
        this.title = title;
    }

}

public class GLT1 {
    public static void main(String[] args) {
        Person p = new Person("John", "123 Main St", "123-456-7890", "johdoe@tempmail.com");
        Student s = new Student("John", "123 Main St", "123-456-7890", "johstudent@tempmail.com", "Freshman");
        Employee e = new Employee("John", "123 Main St", "123-456-7890", "johnemp@tempmail.com", "Office 1", 1000,
                new Date(3, 1, 2020));
        Faculty f = new Faculty("John", "123 Main St", "123-456-7890", "johnfaculty@tempmail.com", "Office 1", 1000,
                new Date(4, 3, 2023), "9-5", "Professor");
        Staff st = new Staff("John", "123 Main St", "123-456-7890", "johnthejanit@tempmail.com", "Office 1", 1000,
                new Date(28, 2, 2023), "Janitor");
        p.display();
        System.out.println();
        s.display();
        System.out.println();
        e.display();
        System.out.println();
        f.display();
        System.out.println();
        st.display();
    }
}
