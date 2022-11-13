package FileOperations;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class FileReadQ1 {
    public static void main (String[] args) throws FileNotFoundException{
        File inputFile = new File ("C:/Users/e5657425/Documents/quiz_numbers.txt");
        Scanner scan = new Scanner(inputFile);
        int LineNumber=0;
        double sum = 0.0;
        while (scan.hasNext()){
            int number = scan.nextInt();
            sum = sum + number;
            LineNumber++;
            System.out.println(LineNumber + " " + number);
        }
        double mean = sum / LineNumber;
        System.out.println(mean);
        System.out.println(LineNumber);

    }
}
