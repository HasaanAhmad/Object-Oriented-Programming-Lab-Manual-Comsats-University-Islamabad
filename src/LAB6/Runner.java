
package LAB6;

class person {
    protected String name;
    protected String id;
    protected int phone;

    person() {
        name = " ";
        id = " ";
        phone = 0;
    }

    person(String name, String id, int phone) {
        this.name = name;
        this.id = id;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Phone: " + phone);
    }
}

class Student extends person {
    private String rollNo;
    private int marks;

    Student() {
        super();
        rollNo = " ";
        marks = 0;
    }

    Student(String name, String id, int phone, String rollNo, int marks) {
        super(name, id, phone);
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

}

class Runner {
    public static void main(String[] args) {
        Student s1 = new Student("Hasaan Ahmad", "SP22-bse-017", 34324234, "017", 100);
        s1.display();
    }

}