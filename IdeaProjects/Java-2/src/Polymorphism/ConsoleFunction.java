package Polymorphism;
import java.io.Console;
import java.util.*;

public class ConsoleFunction {
    public static void main(String[] args){
        Console my_console = System.console();
        String my_val = my_console.readLine();
        String i = my_val;
        System.out.println(i);
    }
}
