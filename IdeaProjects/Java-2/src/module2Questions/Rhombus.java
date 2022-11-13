package module2Questions;

public class Rhombus extends Quadrilateral {
    double height;
 //   double side;
    public Rhombus(double side,double height) {
        super(side, side, side, side);
        this.height = height;
//        this.side = side;
    }

    public double getArea() {
        return super.side1 * height ;
    }

    public double getPerimeter(){
        return super.getPerimeter();
    }
}
