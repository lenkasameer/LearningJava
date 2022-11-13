//Description
//        Write a function called ‘fizzBuzz’, that takes in an array of integers, and for each number in the array, if the number is —
//        1) a multiple of three, it prints ‘Fizz’ (instead of the number).
//        2) a multiple of five, it prints ‘Buzz’ (instead of the number).
//        3) a multiple of both three and five, it prints ‘FizzBuzz’ (instead of the number).
//        4) otherwise, it simply prints the number.
//
//        For example, if the array is - 2 3 5 8 12 15 16
//        The output would be - 2 Fizz Buzz 8 Fizz FizzBuzz 16


package PracticeQuestionsOnFunctions;

public class Question1 {
    public static void main (String[] args){
        int [] array = new int[] {2, 3, 5, 8, 12, 15, 16};
        fizzBuzz(array);

    }
    public static void fizzBuzz(int[] numbers){
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i]%3 == 0 && numbers[i]%5 == 0 ) {
                System.out.print("FizzBuzz" + " ");
            } else if (numbers[i]%3 == 0){
                System.out.print("Fizz" + " ");
            } else if (numbers[i]%5 == 0) {
                System.out.print("Buzz" + " ");
            } else {
                System.out.print(numbers[i] + " ");
            }
        }
    }


}
