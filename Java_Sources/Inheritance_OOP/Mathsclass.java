package Inheritance_OOP;

class grade10 {
    public void Grade10() {
        System.out.println("Hello, I'm studying grade Ten.");
    }
}

class grade11 extends grade10{
    public void Grade11() {
        System.out.println("I'm studying grade Eleven");
    }
}


public class Mathsclass {
    public static void main(String[] args) {
        grade11 obj11 = new grade11();
        obj11.Grade11();
        obj11.Grade10();

    }
}
