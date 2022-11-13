//Description
//        You are given an array of decimal numbers. You are required to round these into integers.
//        Read the documentation below, and use the function that fits best to write the code.
//        https://docs.oracle.com/javase/7/docs/api/java/lang/Math.html



package LearningFunctions;
import java.util.*;

public class FunctionQ6 {
    public static void main(String[] args){
        double[] array = new double[] {10.32,20.36,30.50,40.51,50.49,60.43,71.71};
        for(int i = 0; i <  array.length; i++) {
            array[i] = round(array[i]);
        }


        for(int i = 0; i <  array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    static double round(double i){
//        double i_round = Math.round(i);
//        return i_round;
        return Math.round(i);
    }


}
