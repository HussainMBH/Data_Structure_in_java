package DesignPattern.SingletonDesign;

public class SingletonMain {
    public static void main(String[] args) {
        SingletonTest singleton1 = SingletonTest.getInstance();
        SingletonTest singleton2 = SingletonTest.getInstance();
        singleton1.displayMessage();
        singleton2.displayMessage();
    }
}
