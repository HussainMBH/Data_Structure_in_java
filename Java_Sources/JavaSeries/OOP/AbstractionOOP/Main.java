package JavaSeries.OOP.AbstractionOOP;

abstract class Parent{
    abstract void parenttellstudy();
}

class Son extends Parent{
    void parenttellstudy(){
        System.out.println("I'll study Engineering");
    }
}

public class Main {
    public static void main(String[] args) {
        Son objsn = new Son();
        objsn.parenttellstudy();
    }
}
