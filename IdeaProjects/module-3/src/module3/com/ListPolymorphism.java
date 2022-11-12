package module3.com;
import java.util.*;

public class ListPolymorphism {
    public static void main(String[] args){
        List<Student> studentList1 = new LinkedList<Student>();
        List<Student> studentList2 = new LinkedList<Student>();

        Student s1 = new Student("Sujit", 1);
        Student s2 = new Student("Siddharth", 2);
        Student s3 = new Student("Karanpreet", 3);
        Student s4 = new Student("Hari", 5);
        Student s5 = new Student("Tricha", 4);

        studentList1.add(s1);
        studentList1.add(s2);
        studentList1.add(s3);
        studentList2.add(s4);
        studentList2.add(s5);
        printStudentList(studentList1);
        System.out.println("*********************************");
        printStudentList(studentList2);


    }
    public static void printStudentList(List<Student> students) {
        for(Student s : students) {
                System.out.println(s.getDetails());

        }
//        for (int i = 0 ; i < students.size(); i++){
//            if (i==1){
//                System.out.println(students.get(i).getDetails());
//            }
//        }
    }
}
