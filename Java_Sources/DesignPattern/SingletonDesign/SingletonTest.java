package DesignPattern.SingletonDesign;

public class SingletonTest {
    // in singleton design pattern must thing is private constructor
    private static SingletonTest singletonTest;

    /**
     *create private constructor
     **/
    private SingletonTest(){

    }

    /**
     create a static method to get instance
     **/
    public static SingletonTest getInstance(){
        if(singletonTest == null){
            singletonTest = new SingletonTest();
        }
        return singletonTest;
    }

    public void displayMessage(){
        System.out.println("I have called using Late Instantiation Singleton object");
    }

}
