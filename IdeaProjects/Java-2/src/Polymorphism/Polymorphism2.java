package Polymorphism;

public class Polymorphism2 {
    public static void main (String[] args){
   //     Student2 obj = new Student2("Karthik", 2);
        Student2 obj = new Student2("Karthik", 2);
        PrintDetails(obj);
        Professor1 prof = new Professor1("R.C. Verma", "Software Engineering", 50000);
        // below is an example of dynamic polymorphism where variable of Student1 first
        // took the form of Student1 object and then in the below it will take the form
        // of PhdStudent .
        obj = new PhdStudent1("Sanjay", 3, "Deep Learning", prof.getName());
        PrintDetails(obj);


    }
    public static void PrintDetails(Student2 obj){
        System.out.println(obj.getDetails());

    }
}

class Person{
    protected final String name;

    public Person(String name) {
        this.name = name;
    }
}
class Student2 extends Person {
    protected int year;
    protected final static int annualFees = 10000;

    public Student2(String name, int year){
        super(name);
        this.year = year;
    }

    public float computeFees(){
        return year * annualFees;
    }

    public String getDetails(){
        return this.name + " is in " + this.year + " year of graduation and his annual fees is " + computeFees();
    }



}

class Professor1 extends Person{
    private final String courseOffered;
    private final float salary;

    public Professor1(String name, String courseOffered, float salary ){
        super(name);
        this.courseOffered = courseOffered;
        this.salary = salary;
    }
    public String getDetails(){
        return "Name of the professor " + this.name + "\n" + "Course offered " + this.courseOffered +
                "\n" + "Salary of the professor " + this.salary;
    }

    public String getName(){
        return this.name;
    }
}
class PhdStudent1 extends Student2{
    private String subject;
    private String professorName;
    private int tuitionFees;

    public PhdStudent1(String name, int year, String subject, String professorName){
        super(name, year);
        this.subject = subject;
        this.professorName = professorName;
        //       this.tuitionFees = tuitionFees;
    }

    public float computeFees(){
        return super.computeFees() * 0.9f;  // method overriding
    }
}


