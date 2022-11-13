package AbstractClass;

public class AbstractionPolymorphism {
    public static void main (String[] args){
        //     Student2 obj = new Student2("Karthik", 2);
        Student obj1 = new Student("Karthik", 2);
        //       PrintDetails(obj);
        Professor prof = new Professor("R.C. Verma", "Software Engineering", 50000);
        // below is an example of dynamic polymorphism where variable of Student1 first
        // took the form of Student1 object and then in the below it will take the form
        // of PhdStudent .
        Student obj2 = new PhdStudent("Sanjay", 3, "Deep Learning", prof.getName());
//        PrintDetails(obj);

        Person[] array =  {obj1, prof,obj2};
        PrintDetails(array);


    }
    public static void PrintDetails(Person[] person){
//        for (Person1 i:person){             // this for loop is read as for variable i of  type Student3 in array student
//            System.out.println(i.getDetails());
//        }
        for (int i=0;i < person.length; i++){   // this is another way of iterating through array
            System.out.println(person[i].getDetails());

        }
    }
}

abstract class Person{
    protected final String name;

    public Person(String name) {
        this.name = name;
    }
//    public String getDetails(){    // this is a dummy method implmentation to solve the compilation error. but this is not a good approach.
//        return "I am dummy method";
//    }

    public abstract String getDetails();
}
class Student extends Person {
    protected int year;
    protected final static int annualFees = 10000;

    public Student(String name, int year){
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

class Professor extends Person {
    private final String courseOffered;
    private final float salary;

    public Professor(String name, String courseOffered, float salary ){
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
class PhdStudent extends Student {
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




