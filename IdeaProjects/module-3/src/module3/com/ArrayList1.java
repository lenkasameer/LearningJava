
//Creating ArrayList
//Description
//The following code was written using an array in your previous practice coding question. Modify the code, and implement it using the ArrayList.
//
//Also, a new element 99 must be added at the end of the newly implemented ArrayList. This implementation is already written in the code.
//
//Sample input
//There is no input for this program.
//
//Expected output
//2
//4
//5
//10
//99




package module3.com;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main (String[] args){
        ArrayList<Integer> random = new ArrayList<Integer>();
        random.add(2);
        random.add(4);
        random.add(5);
        random.add(10);

        random.add(99);                    //Command for adding a new element
        printArray(random);
    }
    public static void printArray(ArrayList random) {   //Change the type of the parameter to ArrayList
        for(Object o : random ) {              //Change the data type of 'a' from 'int' to 'Object'
             System.out.println((int) o);
        }
    }
}
