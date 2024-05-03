package Core_Java;

abstract class Boss{
    abstract void arrangethings(String name);
    void sellthings(){
        System.out.println("Please sell these baby soaps");
    }
}

class staff extends Boss{
    void arrangethings(String name){

        System.out.println("i'm " +name+ " i'm arranging all biscuits section");
    }
}
class empl extends Boss{
    void arrangethings(String name){

        System.out.println("I'm " +name+ " I'm arranging all Oil Bottles");
    }
}

public class tryOOP01 {
    public static void main(String[] args) {
        staff objstaff = new staff();
        objstaff.sellthings();
        objstaff.arrangethings("Bahir");
        empl objempl = new empl();
        objempl.arrangethings("Hussain");
        objempl.sellthings();
    }
}
