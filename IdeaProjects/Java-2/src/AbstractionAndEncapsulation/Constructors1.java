//Here’s a quick summary of the topics you learnt about in this session:
//
//        Classes and objects: 'Classes and objects' make up the framework of object-oriented programming which revolves around the real-life entities.
//
//        Class: A class is a blueprint from which objects are created. It represents a set of attributes and methods, which represent a group of entities, and is common to all the objects of one type.
//
//        Object: An object represents a real-life entity, which belongs to a class with the same properties as that of the object. The object can perform all functionalities declared in its class, by invoking the methods declared there.
//
//
//        Constructors: A constructor is used to initialize the state of an object.
//
//        Default constructor: A constructor that doesn’t need to be declared and is without any parameter is known as a default constructor. A default constructor can assign user defined or default values to the instance variables of the object depending on the type. For example, 0, null, etc.
//
//
//        Parameterised constructor: A constructor that takes in some parameter for the initialisation of instances variables while creating an object is known as a parameterized constructor. A parameterized constructor is used to assign different values to the instance variables when creating  distinct objects.
//
//
//        The this, static, and final keywords:
//
//        The this keyword: The this keyword can be used to refer to the current class instance variables. If there is ambiguity between the instance variables and parameters, the this keyword resolves the problem.
//
//
//        The static keyword: Anything which is declared static belongs to the entire class, rather than only to the instance of the class, i.e. a static member is the common property of all the objects of the class.
//
//
//        The final keyword: The final keyword is used to restrict the user from updating the value of instance variables. If any variable is declared as final, you cannot change the value of that variable. If any method is declared as final, you cannot override that particular method.
//
//
//        Abstraction: Abstraction is a principle based on hiding the details of the implementations of classes, and access only certain features/functionalities given to the users/other parts of the program. This is done by writing your program using the framework of classes and objects.
//What is Abstraction?
//
//Abstraction is a principle based on hiding the details of implementations of classes, and access only certain features/functionalities given to the users/other parts of the program. This is done by writing your program using the framework of classes and objects.
//
//
//
//Advantages of abstraction:
//
//Abstraction allows you to use the functionality (behaviour) of the objects from other parts of the code without showing the internal implementation of that functionality (methods).
//
//Rights to change the implementation of a class can be given only to a certain set of users. Others cannot go and arbitrarily change anything within the class, apart from using the behaviours defined by that class by creating and using its objects.
//Static Variable: Variables declared as static are known as static variables. Static variable is used while referring to the common property of all the objects of the class. For example, university name for students in the Student class for an information management system of a university. Static variables are useful if you need to share the same set of information across all objects of a class, such as the University name in our example.
//
//
//
//The static variable is allocated memory only once, at the time of loading a class.
//
//
//
//Static Method: Methods declared as static are known as static methods. A static method belongs to the class, rather than object of a class. It can be called without creating the object of the class, using ClassName.staticMethod( ) notation.
//
//
//
//Static methods cannot access non-static variables, or call non-static methods. But static methods can access any static variable and change its value.
//Static members (both attributes and methods) does not get its own copies with every instance of a class. If the value of a static attribute is accessed
// from within any of the objects of a class, at any point, the value will be the same. Similarly,
// if a static attribute is updated from any of the objects of a class, this update will reflect in
// its value from all the objects, regardless of which object of the class it is accessed from thereon.
//
//When you try to call static methods using an object, it will give you a warning,
// but you can still call that method. The reason for this is that static methods
// are common to all the objects and any particular object can call those methods.
// But it is not recommended to call these methods using the objects.

//A class may have as many constructors as needed. Of course,
// they all will have the same name as the class itself.
// They must differ in terms of the number and type of parameters, i.e.
// the method signature of all constructors of a class must be different
// in some or the other way from the signatures of all other constructors.
//
//A default constructor will not be created in case there is even one parameterized
// constructor in the class. In case you still want to create objects without initialising
// instance variables (advantage of default constructor),
// you can do so by adding a default constructor in the class.

package AbstractionAndEncapsulation;

public class Constructors1 {
    public static void main(String[] args){
        Circle1 c1 = new Circle1(10f);
        System.out.println("Area of circle " + c1.Area() );
      //  c1.radius = 15f;  //
        System.out.println("Area of circle " + c1.Area() );
    }
}


class Circle1{
    public final float radius;
    public final static float pi = 3.141f;
    public Circle1(float radius){
        this.radius = radius;
    }
    public float Area(){
        return 3.141f * radius * radius;
    }

    public float circumFerence(){
        return 2 * 3.141f * radius;
    }
}


