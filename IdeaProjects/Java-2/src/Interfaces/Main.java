package Interfaces;

public class Main {
    public static void main(String[] args){
        Person obj1 = new Student("Sanjay",10234, 15000, 2);
        Person obj2 = new Professor("SKC", 100, 150000);
        Person[] array = {obj1,obj2};
        PrintDetails(array);
    }
    public static void PrintDetails(Person[] person){
        for (Person p:person){
            System.out.println(p.getDetails());
        }

    }
}
