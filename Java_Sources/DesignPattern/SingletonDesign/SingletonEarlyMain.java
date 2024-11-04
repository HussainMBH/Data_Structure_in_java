package DesignPattern.SingletonDesign;

public class SingletonEarlyMain {
    public static void main(String[] args) {
        SingletonEarly obj = SingletonEarly.getInstance();
        obj.displayMessage();
    }
}
