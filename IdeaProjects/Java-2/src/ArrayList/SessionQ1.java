package ArrayList;

public class SessionQ1 {
    public static void main(String[] args){
        int[] arr = {2,2,1,1,1,0,0,3,3,4};
        int i = 0;
        int k = 0;
        for (i = 1; i < arr.length; i++){

            if (arr[i - 1] != arr[i]){
                    k = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = k;

            }
            for (i = 1; i < arr.length; i++) {
            System.out.println(arr[i]);

            }

        }
    }
}
