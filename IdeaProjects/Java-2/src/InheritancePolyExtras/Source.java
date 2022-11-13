package InheritancePolyExtras;
import java.util.Scanner;


class Shape{
    protected String displayShape(){
            return "The shape is a circle";
        }
}

class Triangle extends Shape{

    public String displayShape(){
        return "The shape is a triangle";
    }

}

class Rectangle extends Shape{
    public String displayShape(){
        return "The shape is a rectangle";
    }

}


public class Source {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Shape obj = new Triangle();
        Shape obj1 = new Rectangle();
        int numberOfSides = in.nextInt();
        switch (numberOfSides){
            case 0:
                System.out.println("The shape is a circle");
                break;
            case 4:
                System.out.println(obj1.displayShape());
                break;

            case 3:
                System.out.println(obj.displayShape());
                break;

            default:
                System.out.println("Enter a valid number of sides!");


        }
    }
}
