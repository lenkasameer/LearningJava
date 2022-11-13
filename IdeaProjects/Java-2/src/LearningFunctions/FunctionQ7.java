//Array
//        Description
//        There is an internal library called arrays, which can perform multiple operations
//        on arrays.
//        https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html
//
//        Find the function that can sort an array, and use it to sort the array
//        given in the question.
//        (Hint:  Use the internal library sort() to sort a given array. For e.g.,
//        sort(long[] a) sorts the specified array in ascending numerical order.)
//
//        Input:
//        No Input Required
//
//        Output:
//        2 12 19 29 34 43 45 56

package LearningFunctions;
import java.util.*;

public class FunctionQ7 {
    public static void main (String[] args) {
        int[] array = new int[] {29,34,12,45,56,02,43, 19};
        sortArray(array);
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

    }
    public static void  sortArray(int[] arr){
        Arrays.sort(arr);
    }

}
