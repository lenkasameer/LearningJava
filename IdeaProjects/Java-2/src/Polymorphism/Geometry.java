package Polymorphism;

public class Geometry {
    public static void main(String[] args){
        Rectangle g1 = new Rectangle(10, 20);  // g1 takes the form of rectangle object
        g1.area();
        g1.perimeter();
        g1 = new Square(30);     // g1 now takes the form of square object
        g1.area();
        g1.perimeter();

    }
}

class Rectangle{
    protected int width;
    protected int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void area(){
        System.out.println(" Area of the rectangle = " + (width * height));
    }

    public void perimeter(){
        System.out.println(" Perimeter of the rectangle = " + (2*width + 2*height));
    }
}

class Square extends Rectangle{
    public Square(int width){
        super(width, width);
    }
    public void area(){
        System.out.println(" Area of the square = " + (super.width * super.width));
    }

    public void perimeter(){
        System.out.println(" Perimeter of the Square = " + (4 * super.width));
    }
}
