package module3.com;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayList3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n = s.nextInt();
        for (int i = 0; i < n; i++){
            list.add(s.nextInt());
        }
        reverseArrayList(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }
    public static void reverseArrayList(ArrayList<Integer> list){
        int k = 0;
        int m = 0;
        int n = 0;
        for (int i = list.size() - 1; i > m; i--){
            k = list.get(i);
            n = list.get(m);
            list.set(i, n);
            list.set(m,k);
            m++;
        }

    }
}
