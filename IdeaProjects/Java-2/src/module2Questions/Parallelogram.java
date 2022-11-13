package module2Questions;
import java.math.*;

 class Parallelogram extends Quadrilateral{
    double height;

    public Parallelogram(double side1, double side2, double height) {
        super(side1, side2, side1, side2);
        this.height = height;
    }

    @Override
    public double getArea() {
        return super.side1 * this.height;
    }

    public double getPerimeter(){
        return super.getPerimeter();
    }


}
