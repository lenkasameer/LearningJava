
//'Student' Class
//        Description
//        Declare a constructor in the Student class and then create a new object named
//        s1 (name -  karan | roll number - 1056 | cgpa - 8.8) and call
//        method displayProfile( ) below. Also, print details of percentage of
//        s1 using findPercentage( ) method.
//
//        The findPercentage() method should be used in printing as
//        'Percentage of s1 is 88.0'. Check sample output below.
//
//        Input:
//        No input required
//
//        Output:
//        1056 karan 8.8
//        Percentage of s1 is 88.0





package AbstractionAndEncapsulation;

public class PracticeQ {
    public static void main(String[] args){
        Student s1 = new Student("Karan",1056, 8.8f);
        s1.displayProfile();
        System.out.println("Percentage of s1 is " + s1.findPercentage());

    }
}

class Student{
    public  String name;
    public  int rollNumber;
    public  float cgpa;

    public Student(String name, int rollNumber, float cgpa){
        this.name = name;
        this.rollNumber = rollNumber;
        this.cgpa = cgpa;


    }

    public void displayProfile(){
        System.out.println(rollNumber + " " + name + " " + cgpa);


    }

    public float findPercentage(){
        return 10 * cgpa;
    }
}
