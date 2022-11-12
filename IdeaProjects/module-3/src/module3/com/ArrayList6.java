package module3.com;
import java.util.*;

public class ArrayList6 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        moveZerosToEnd(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    // Method to find move all zeros to the end of the array
    static void moveZerosToEnd(int[] arr) {
        // Write your code here
        //int k = 0;
        int r = 0;
        int m = arr.length - 1;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0){
                r = arr[m];
                int l = i ;
                for (int k = i + 1; k <= m; k++){
                    arr[l] = arr[k];
                    l++;

                }
                arr[m] = 0;
            }

        }
    }
}
