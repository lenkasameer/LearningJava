package LearningFunctions;
import java.util.*;
public class FunctionPassByRef {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int lcm = 0;
        FunctionPassByRef result = new FunctionPassByRef();
        result.lcm(num1,num2,lcm);
        System.out.println(lcm);

    }
    void lcm(int num1, int num2, int lcm){
        int gcd = 0;
        for (int i = 1; i <= num1 && i <= num2; i++){
            if (num1%i == 0 && num2%i == 0){
                if (i > gcd){
                    gcd = i;
                }
            }

        }
        lcm = (num1 * num2) / gcd;
        System.out.println(lcm);
    }
}
