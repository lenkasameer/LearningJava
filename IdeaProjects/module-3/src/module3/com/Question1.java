package module3.com;
import java.util.*;

public class Question1 {
    public static void main(String[] args){
// You are given an unsorted array with n integers.
// You need to check if an integer k is present in that array.
// If  k is present in the given array, print “true” else print “false”.
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        int k = s.nextInt();
        search(arr, k);
    }
    static void search(int[] arr, int k) {
        // Write your code
        boolean flag = false;
        for (int i:arr){
            if (i==k){
                flag = true;
                break;
            }
        }
        System.out.println(flag);
    }

}
