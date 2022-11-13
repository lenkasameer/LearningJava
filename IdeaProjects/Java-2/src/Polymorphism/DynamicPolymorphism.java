package Polymorphism;

public class DynamicPolymorphism {
    public static void main (String[] args){
        Student1 obj = new Student1("Karthik", 2);
        PrintDetails(obj);
        Professor prof = new Professor("R.C. Verma", "Software Engineering", 50000);
        // below is an example of dynamic polymorphism where variable of Student1 first
        // took the form of Student1 object and then in the below it will take the form
        // of PhdStudent .
        obj = new PhdStudent("Sanjay", 3, "Deep Learning", prof.getName());
        PrintDetails(obj);


    }
    public static void PrintDetails(Student1 obj){
        System.out.println(obj.getDetails());

    }
}

class Student1{
    protected final String name;
    protected int year;
    protected final static int annualFees = 10000;

    public Student1(String name, int year){
        this.name = name;
        this.year = year;
    }

    public float computeFees(){
        return year * annualFees;
    }

    public String getDetails(){
        return this.name + " is in " + this.year + " year of graduation and his annual fees is " + computeFees();
    }



}

class Professor {
    private final String name;
    private final String courseOffered;
    private final float salary;

    public Professor(String name, String courseOffered, float salary ){
        this.name = name;
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
class PhdStudent extends Student1{
    private String subject;
    private String professorName;
    private int tuitionFees;

    public PhdStudent(String name, int year, String subject, String professorName){
        super(name, year);
        this.subject = subject;
        this.professorName = professorName;
 //       this.tuitionFees = tuitionFees;
    }

    public float computeFees(){
        return super.computeFees() * 0.9f;  // method overriding
    }
}


