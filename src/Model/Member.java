package Model;

public class Member {
    String name;
    int age;
    String address;
    int salary;

    public Member(String name, int age, int  salary) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
    }

    public void calculateSalary(int leaves) {
        int workingDays = 24 - leaves;
        int i =  workingDays * this.salary;
        System.out.println(i);
    }
}