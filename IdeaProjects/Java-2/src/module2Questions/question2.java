package module2Questions;
import java.util.Scanner;

public class question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double height = sc.nextDouble();
        Quadrilateral obj1 = new Parallelogram(side1,side2,height);

        double side = sc.nextDouble();
        height = sc.nextDouble();
        Quadrilateral obj2 = new Rhombus(side, height);
        Quadrilateral[] array = {obj1,obj2};
        PrintDetails(array);



    }
    public static void PrintDetails(Quadrilateral[] quadri){
        for (Quadrilateral i:quadri){
            System.out.println("Perimeter: " + i.getPerimeter());
            System.out.println("Area: " + i.getArea());
        }
    }
}
