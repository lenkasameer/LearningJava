package Interfaces;

public class Student implements Person {
    protected String name;
    protected int rollNumber;
    protected int salary;
    protected int year;

    public Student(String name, int rollNumber, int salary, int year) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.salary = salary;
        this.year = year;
    }

    public int ComputeSalary(){
        return this.salary * this.year;
    }

    public String getDetails(){
        return this.name + " has the roll number " + this.rollNumber + " is in " + this.year + " year "
                + "getting a scholarship of " + ComputeSalary();
    }
}
