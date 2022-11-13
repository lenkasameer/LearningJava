package InheritanceAndPolymorphism;

public class PracticeQ3 {
    public static void main (String[] args){
        Square sq = new Square(10.0, 10.0);
        sq.area();
        sq.perimeter();


    }
}

class Rectangle2 {
    private double width;
    private double height;

    Rectangle2(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void area() {
        System.out.println("Area of Rectangle is: " +  (width * height) ) ;
    }

    public void perimeter() {
        System.out.println("Perimeter of Rectangle is: " + ( (2* width) +
                (2* height) ) ) ;
    }
}

class Square extends Rectangle2{
//    private double side;

    public Square(double width, double height) {
        super(width, height);
    }

//    public Square(double side) {
//        super(side, side);
//    }

    public void area(){
        System.out.println("Area of Rectangle is: " + (super.getHeight() * super.getWidth()));
    }

    public void perimeter(){
        System.out.println("Perimeter of Square is: " + ( (2* super.getWidth()) +
                (2* super.getHeight()) ) ) ;

    }
}
