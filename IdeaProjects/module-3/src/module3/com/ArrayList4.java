package module3.com;
import java.util.ArrayList;

public class ArrayList4 {
    public static void main(String[] args){
        ArrayList<Float> random = new ArrayList<Float>();
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99.9f);

        //Write new statements here
        //add and remove methods to replace the fourth element (10) with 15
        printList(random);
        random.remove(3);
        random.add(3,15f);

        printList(random);
    }
    public static void printList(ArrayList<Float> arr) {
        for(Float num : arr) {
            System.out.println(num);
        }
    }
}
