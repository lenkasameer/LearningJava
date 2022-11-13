//A bank has decided to renew its policy; according to the new policy, you can only own a
// savings account with minimum savings of Rs.1000. Construct a class ‘SavingAmount’
// with only one integer instance variable ‘saving’. The class will have the following
// methods in it:
//        A setter method that will take an integer as a parameter and set the value of savings
//        equal to that of the integer .
//        A getter method that will return the saving .
//        An increment method that will increase the savings by Rs.1000 .
//        A decrement method that will decrease the savings by Rs.100 .
//        A method to check the savings of a person say 'checkSavings'.
//        If the savings amount is greater than or equal to Rs.1000, print “Congratulations!
//        You have saved a good amount”. If the amount is less than Rs.1000 and greater than or equal
//        to 0, print “Insufficient saving!”. If the savings amount is less than 0, print “You
//        are in debt”.
//
//        Input: Your program should take the integer amount.
//
//        Output:  The output should be in the following format.
//        Call the decrement method once and then print the value returned by the getter method in the class.
//        Call the increment method once and then print the value returned by the getter method in the class.
//        Call the 'checkSavings' method.
//        Display the total savings.
//
//        Sample Input:
//        20000



package AbstractionAndEncapsulation;
import java.util.*;
public class LecturePracticeQ {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SavingAmount obj = new SavingAmount();
        obj.setInitialSaving(sc.nextInt());
        obj.decrementSaving();
        obj.incrementSaving();
        obj.checkSaving();
        System.out.println("Your current savings are Rs " + obj.getCurrentSaving());



    }
}

class SavingAmount{
    private int initialSaving;
    private int currentSaving;

    public int getCurrentSaving() {
        return currentSaving;
    }



    public  SavingAmount() {
        this.initialSaving = 0;
    }

    public int getInitialSaving() {
        return initialSaving;
    }

    public void setInitialSaving(int initialSaving) {
        this.initialSaving = initialSaving;
    }

    public void incrementSaving(){

        initialSaving = initialSaving + 1000;
        currentSaving = initialSaving;

    }

    public void decrementSaving() {

        initialSaving = initialSaving - 100;
        currentSaving = initialSaving;
    }
    public void checkSaving(){
        if (currentSaving >= 1000){
            System.out.println( "Congratulations! You have saved a good amount");
        } else {
             System.out.println("Insufficient saving!");
        }
    }
}
