package Abstraction_OOP;

public class Child extends Parent{
    public static void main(String[] args) {
        Child ch = new Child();
        ch.study();
        ch.food();
    }

    @Override
    void study() {
        System.out.println("I'm studying Java");
    }
}
