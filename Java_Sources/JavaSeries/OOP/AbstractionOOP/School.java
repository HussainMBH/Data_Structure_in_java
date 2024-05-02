package JavaSeries.OOP.AbstractionOOP;


abstract class teacher{
    abstract void homework();
}

class raja extends teacher{
    void homework(){
        System.out.println("I'll do my homework on tuesday");
    }
}
public class School {
    public static void main(String[] args) {
        raja objraja = new raja();
        objraja.homework();
    }
}
