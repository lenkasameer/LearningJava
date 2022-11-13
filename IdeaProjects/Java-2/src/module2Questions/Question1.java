//Interfaces
//        Description
//        Please implement:
//
//        An interface named SwordFighter. The interface should contain the following variable and methods:
//        An int variable maxSwordsWielded, which should be set to 2
//        An abstract void method escape()
//        An abstract void method showWeapon()
//        An abstract void method attack()
//
//        In the Knight class, please override the showWeapon() method from the SwordFighter interface, and the method should print out "Shows Sword" in a new line
//
//        In the Ninja class, please override the showWeapon() class from theSwordFighter  interface, and the method should print out  "Shows Katana" in a new line
//
//        Sample Input :
//        No input Required
//
//        Expected Output:
//        Maximum swords that can be wielded: 2
//        Shows Sword
//        Shows Katana
//        Knight stops the horse and attacks
//        Ninja steps forward and attacks
//        Knight climbs the horse and flees
//        Ninja gets into forest and flees







package module2Questions;

public class Question1 {
    public static void main(String[] args){
        Knight kn = new Knight();
        Ninja  nj = new Ninja();
        kn.showWeapon();
        nj.showWeapon();

        kn.attack();
        nj.attack();

        kn.escape();
        nj.escape();
    }
}
