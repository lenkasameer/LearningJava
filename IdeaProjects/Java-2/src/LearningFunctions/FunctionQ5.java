package LearningFunctions;
import java.util.*;
public class FunctionQ5 {
    public static void main(String[] args) {
        String string1 = "Welcome";
        String rtr_s = uppercase(string1);
        System.out.println(rtr_s);
    }
    public static String uppercase(String var1){
        String s1 = var1.toUpperCase();
        System.out.println(s1);
        return s1;
    }
}
