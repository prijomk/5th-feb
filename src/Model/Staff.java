package Model;

public class Staff extends Member {
    String department;

    public Staff(String name, int age, String address, int salary, String department) {
        super(name, age, salary);
        this.department = department;
    }
}
