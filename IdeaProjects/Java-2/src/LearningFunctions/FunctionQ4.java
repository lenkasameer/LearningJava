//LCM
//        Description
//
//        Write a function that takes two numbers as parameters and returns the LCM of
//        these two numbers. So, if the values passed into the function are 12 and 20,
//        the function will return the lowest common multiple of these two, i.e 60.


package LearningFunctions;
import java.util.*;

public class FunctionQ4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        // Enter the two numbers in the input console
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        System.out.print(lcm(number1, number2));
    }
    public static int lcm(int n1, int n2){
        int gcd = 0;
        for (int i=1; i<=n1 && i<=n2; i++){
            if (n1%i == 0 && n2%i == 0){
                if (i>gcd){
                    gcd = i;
                }
            }
        }
        int lcm=(n1 * n2) / gcd;
        return lcm;
    }
}
