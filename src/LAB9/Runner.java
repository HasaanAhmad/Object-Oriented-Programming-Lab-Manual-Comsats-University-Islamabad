package LAB9;

public class Runner {
    public static void main(String[] args) {

        EmployeeTask e = new EmployeeTask("Ahmed", "11,02,2001", 20000);
        StudentTask s = new StudentTask("Ali", 22, 3.5);
        e.register();
        s.register();
    }
}