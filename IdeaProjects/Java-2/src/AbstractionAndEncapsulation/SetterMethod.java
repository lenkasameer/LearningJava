
//Create an object of the given Person class and initialise that object by assigning
//'Ankit' to the 'name' variable using the setter method.
//
//        Input
//        No Input Required




package AbstractionAndEncapsulation;

public class SetterMethod {
    public static void main(String[] args){
        Person person = new Person(" ");
        System.out.println(person.getName());
        person.setName("Ankit");
        System.out.println(person.getName());

    }

}

class Person{
    private  String name;

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name){
        this.name = name;

    }

    public String getName(){
        return this.name;
    }
}
