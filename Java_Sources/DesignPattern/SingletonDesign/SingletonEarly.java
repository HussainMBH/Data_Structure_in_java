package DesignPattern.SingletonDesign;

public class SingletonEarly {
    private static SingletonEarly instance = new SingletonEarly();
     //private constructor to avoid client applications to use constructor
    private SingletonEarly(){}
    public static SingletonEarly getInstance(){
        return instance;
    }

    public void displayMessage(){
        System.out.println("I called using Early Instantiation Singleton object");
    }
}
