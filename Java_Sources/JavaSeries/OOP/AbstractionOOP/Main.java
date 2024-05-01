package JavaSeries.OOP.AbstractionOOP;

abstract class Parent{
    abstract void parenttellstudy();
}

class Son extends Parent{
    void parenttellstudy(){
        System.out.println("I'll study Engineering");
    }
}
class Dad{
    void Dadmoney(){
        int salary = 500000;
        System.out.println(salary);
    }
}

class Daughter extends Dad{
    int Daughtersalary = 15000;
}

public class Main {
    public static void main(String[] args) {
        Son objsn = new Son();
        Daughter objda = new Daughter();
        objda.Dadmoney();
        objsn.parenttellstudy();
    }
}
