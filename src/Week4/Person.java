package Week4;

public class Person {
    private String name;
    private String phone;
    private String ssn;
    private String address;

    public Person(String name, String phone, String ssn, String address) {
        this.name = name;
        this.phone = phone;
        this.ssn = ssn;
        this.address = address;
    }
    public String toString() {
        return name + " has " + ssn + " and " + phone + " and lives in " + address;
    }
}
