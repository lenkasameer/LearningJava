package LearningFunctions;

public class XYZ {
    public static void main(String[] args){
        int toyNumber = 5;
        XYZ temp = new XYZ();
        temp.play(toyNumber);
        System.out.println("Toy number in main " + toyNumber);
    }

    void play(int toyNumber){
        System.out.println("Toy number in play " + toyNumber);
        toyNumber++;
        System.out.println("Toy number in play after increement " + toyNumber);
    }
}
