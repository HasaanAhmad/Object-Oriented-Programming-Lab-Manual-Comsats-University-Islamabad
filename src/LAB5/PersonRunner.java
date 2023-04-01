package LAB5;

import java.sql.PseudoColumnUsage;

class Adrress {
    private String street;
    private String city;
    private String house;
    private String code;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Adrress(String street, String city, String house, String code) {
        this.street = street;
        this.city = city;
        this.house = house;
        this.code = code;
    }

}

class Person {
    private String name;
    private String fname;
    private Adrress adrress;

    public Person(String name, String fname, Adrress adrress) {
        this.name = name;
        this.fname = fname;
        this.adrress = adrress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public Adrress getAdrress() {
        return adrress;
    }

    public void setAdrress(Adrress adrress) {
        this.adrress = adrress;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Father Name: " + fname);
        System.out.println("Street: " + adrress.getStreet());
        System.out.println("City: " + adrress.getCity());
        System.out.println("House: " + adrress.getHouse());
        System.out.println("Code: " + adrress.getCode());
    }
}

public class PersonRunner {
    public static void main(String[] args) {
        Adrress add1 = new Adrress("Street 5", "Islamabad", "B101", "44000");
        Person Hasaan = new Person("Hasaan Ahmad", "Mazhar Hussain", add1);
        Hasaan.display();
    }

}
