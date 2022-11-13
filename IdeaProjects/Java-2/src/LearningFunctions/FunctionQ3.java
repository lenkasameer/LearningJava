//Write a program that takes two numbers as input and returns the square of their sum.
//        For e.g., if the input numbers - 4 and 9 are passsed as parameters into the function,
//        it should return  169, which is  (4+9)2


package LearningFunctions;
import java.util.*;

public class FunctionQ3 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        System.out.print(squareOfSum(number1, number2));
    }
    public static int squareOfSum(int var1, int var2){
        int sumNum = var1 + var2;
//        double result = Math.pow(sumNum,2);
        int result = sumNum * sumNum;
        return result;
    }
}
