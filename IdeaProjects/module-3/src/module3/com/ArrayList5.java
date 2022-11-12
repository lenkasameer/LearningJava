package module3.com;
//import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList5 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        reverseArray(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    // Method to reverse the array
    static void reverseArray(int[] arr) {
        int m = 0;
        int l = 0;
        int r = 0;

        for (int i = arr.length -1 ; i > m; i--){
            r = arr[i];
            l = arr[m];
            arr[m] = r;
            arr[i] = l;
            m++;


        }
    }

}
