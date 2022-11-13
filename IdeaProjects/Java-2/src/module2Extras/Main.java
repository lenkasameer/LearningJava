//
//'Number' class
//Description
//Declare a parameterised constructor in the Number class that will take the real and
// imaginary parts of a number as input. The Number class should contain the getter and
// setter methods for getting and setting the real and imaginary parts of a number.
// Create two more classes ‘Complex’ and ‘PurelyImaginary’. Class Complex extends
// the Number class and checks if the input number is complex or not using checkComplex().
// The PurelyImaginary class inherits the Complex class and decides if the input number is
// purely imaginary using checkPurelyImaginaryNumber().
//
//        Input:  Your program should take the following input:
//        The first line will be the real part of the number.
//        The next line will contain the imaginary part of the number.
//
//        Output: The output of your program will consist of four lines:
//        The first line will display the imaginary part of the input number.
//        The next line will print “The given number is complex” if the number is complex;
//        else, it will print “The given number is real”.
//        The third line will display the number in the standard format, which is:
//        x + iy.
//        4. The last line will display “The number is purely imaginary” if the number is
//        purely imaginary; else, it will print “The number is not purely imaginary”.
//
//
//        Note: If the number is purely imaginary then print only the imaginary part of it like “i8”
//
//        Sample Input:
//        5
//        1.6
//        Sample Output:
//        1.6
//        The given number is complex
//        5.0+i1.6
//        The number is not purely imaginary
//        Execution Time Limit
//        15 seconds

package module2Extras;
import java.util.*;

class Number {
    protected double realPart;
    protected double imaginaryPart;

    public Number(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public void setImaginaryPart(double imaginaryPart){
        this.imaginaryPart = imaginaryPart;
    }

    public void setRealPart(double realPart){
        this.realPart = realPart;
    }

}

class Complex extends Number {
    public Complex(double realPart, double imaginaryPart) {
        super(realPart, imaginaryPart);
    }
    
    public boolean checkComplex(){
        if (super.getRealPart() != 0 && super.getImaginaryPart() != 0 ){
            return true;
        } else {
            return false;
            
        }
    }
}

class PurelyImaginary extends Complex {

//Write your code here

    public PurelyImaginary(double realPart, double imaginaryPart) {
        super(realPart, imaginaryPart);
    }

    public boolean checkPurelyImaginaryNumber(){
        if (super.getRealPart() == 0 && super.getImaginaryPart() != 0){
            return true;
        } else {
            return false;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PurelyImaginary num = new PurelyImaginary(in.nextDouble(), in.nextDouble());
        System.out.println(num.getImaginaryPart());
        if (num.checkComplex()){
            System.out.println("The given number is complex");
        } else if (!num.checkPurelyImaginaryNumber()) {
            System.out.println("The given number is real");
        }

        if (num.checkPurelyImaginaryNumber()){
            System.out.println("i" + num.getImaginaryPart());
            System.out.println("The number is purely imaginary");
        } else {
            System.out.println(num.getRealPart() + "+" + "i" + num.getImaginaryPart());
            System.out.println("The number is not purely imaginary");

        }

    }
}
