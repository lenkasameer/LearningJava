package module3.com;
import java.util.ArrayList;

public class ArrayList2 {
    public static void main (String[] args){
        //Create an ArrayList using Generics
        ArrayList<Float> random = new ArrayList<Float>();
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99.9f);


        printArray(random);

    }
    public static void printArray(ArrayList<Float> random) {

        //Complete the method declaration here
        for (Float i:random){
            System.out.println(i);
        }
    }
}
