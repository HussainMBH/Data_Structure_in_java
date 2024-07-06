package DSADAYQuestions;

public class Day9 {
    public static void main(String[] args) {

    }
}

class ThajParentClass{
    int accountbalane = 50000;
    public void Thaj(){

        System.out.println("I'm hussain's dad");
    }
}
interface hussaininheri{
    void display();
}

class BahirChildClass extends ThajParentClass implements hussaininheri{
    public void Bahir(){
        BahirChildClass bc = new BahirChildClass();

        System.out.println("My account balance is " + bc.accountbalane);


    }
     public void display(){
        System.out.println("This is sample interface");
    }
}