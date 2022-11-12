package module3.com;
import java.util.*;

public class UsingListIterator {
    public static void main(String[] args){
        List<Student2> studentList = new ArrayList<Student2>();
        Student2 s1 = new Student2("Sameer", 100);
        Student2 s2 = new Student2("Harish", 101);
        Student2 s3 = new Student2("Sanjeev", 102);
        Student2 s4 = new Student2("Sagar", 103);
        Student2 s5 = new Student2("Srinivas", 104);
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        printDetails(studentList);


    }
    public static void printDetails(List<Student2> students){
        ListIterator<Student2> it = students.listIterator();
        while (it.hasNext()){
            System.out.println(it.next().getDetails());
        }

    }
}


class Student2{
    private String name;
    private int rollNUmber;

    public Student2(String name, int rollNUmber) {
        this.name = name;
        this.rollNUmber = rollNUmber;
    }

    public String getDetails(){
        return "Name of the Student: " + this.name + "\n" + "Roll NUmber: " + this.rollNUmber;
    }
}