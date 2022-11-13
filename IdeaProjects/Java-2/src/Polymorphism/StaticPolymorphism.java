//Method overloading is also known as early binding as the type of the object is determined at the time of compilation.
//
//
//
//        Two important considerations while using method overloading are:
//
//        The return type of a method may or may not be different.
//
//        The parameter list MUST be different (either lengthwise or datatype wise) for each version of a method in a class.
//
//
//
//        Having the same parameter list but a different return type for a method will result in a compilation error.

//Example of method overloading :
//
//class Addition
//{
//    int add(int a, int b)
//    {
//        return a+b;
//    }
//    int  add(int a, int b, int c)
//    {
//        return a+b+c;
//    }
//}
//public class Demo
//{
//    public static void main(String args[])
//    {
//        Addition obj = new Addition();
//        System.out.println(obj.add(5, 10));
//        System.out.println(obj.add(5, 10, 15));
//    }
//}


// constructor overloading
//____________________________________________________________________________________________

package Polymorphism;

public class StaticPolymorphism {
    public static void main(String[] args){
        Student s = new Student("karthik",3);
        printDetails(s);
        Student stu = new Student("Sidharth", 2, 5000);
        printDetails(stu);


    }
    public static void printDetails(Student s){
        System.out.println("Student name " + s.getName() + " is in " + s.getYear() + " Year " +
                "and his annual fees is " + s.computeFees());
    }
}

class Student{
    private final String Name;
    private int year;
    private  static int annualFees = 10000;

    public Student(String name, int year, int annualFees) {
        this.Name = name;
        this.year = year;
        this.annualFees = annualFees;
    }

    public Student(String name, int year){
        this.Name = name;
        this.year = year;
    }

    public int computeFees(){
        return this.annualFees * this.year;
    }

    public String getName() {
        return Name;
    }

    public int getYear() {
        return year;
    }

    public static int getAnnualFees() {
        return annualFees;
    }
}