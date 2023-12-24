package interview_Questions;

class Base{
    public void Print(){
        System.out.println("Base");
    }
}

class Derived extends Base{
    public void Print(){
        System.out.println("Derived");
    }
}

public class Baseclass {
    public static void DoPrint(Base o){
        o.Print();
    }

    public static void main(String[] args) {
        Base x = new Base();
        Base y = new Derived();
        Derived z = new Derived();
        DoPrint(x);
        DoPrint(y);
        DoPrint(z);
    }
}
