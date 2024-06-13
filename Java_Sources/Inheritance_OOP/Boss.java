package Inheritance_OOP;

public class Boss{
    void todoprojects(){
        System.out.println("We are doing Australia Client Project");
    }

    void buyfoods(){
        System.out.println("Buy any type foods");
    }
}

class Employee extends Boss{
    void todoTasks(){
        System.out.println("We are doing Insurance Company Project");
    }
}

