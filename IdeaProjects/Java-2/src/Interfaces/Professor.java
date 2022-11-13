package Interfaces;

public class Professor implements Person {
    private String name;
    private int employeeNUmber;
    private int salary;

    public Professor(String name,int employeeNUmber, int salary) {
        this.name = name;
        this.employeeNUmber = employeeNUmber;
        this.salary = salary;
    }

    public  String getDetails(){
        return "Professor name - " + this.name + "\n" + "employee number " + this.employeeNUmber
                + "\n" + "Salary " + this.salary;

    }
    public int ComputeSalary(){
        return this.salary;

    }
}
