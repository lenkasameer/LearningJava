//Description
//        Create an object of the given Person class with parameterized constructor
//        initialising the name variable to ‘Ankit’, and then to print the value of
//        ‘name’ variable using getter method.
//
//        Input
//        No Input Required
//
//        Output
//        Ankit




package AbstractionAndEncapsulation;

public class GetterMethod {
    public static void main(String[] args){
        PersonG person = new PersonG("Ankit");
        System.out.println(person.getName());
    }
}
class PersonG{
    private final String name;

    public PersonG(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
