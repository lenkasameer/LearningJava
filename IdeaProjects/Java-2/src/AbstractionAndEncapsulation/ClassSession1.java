package AbstractionAndEncapsulation;

public class ClassSession1 {
    public static float radius = 10f;
    public static void main(String[] args){
        System.out.println(area(radius));
    }
    public static float area(float radius){
        return 3.14f * radius * radius;
    }
}
