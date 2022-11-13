package AbstractionAndEncapsulation;

public class ClassSession1ext {
    public static float radius = 10f;
    public static float length = 20f;
    public static void main(String[] args){
        System.out.println("Area of Circle " + Circle.area(radius));
        System.out.println("Area of Square " + Square.area(length));
    }
}
class Circle{
    public static float area(float radius){
        return 3.14f * radius * radius;
    }
}

class Square{
    public static float area(float length){
        return length * length;
    }
}
