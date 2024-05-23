package JavaSeries.OOP.Polymorphism;

import Inheritance_OOP.Student;

public class School extends RunTimePolymorphism{
    void Students(){
        System.out.println("I'm Hussain, I'm studying Software Engineering");
    }
}

 class Parents extends RunTimePolymorphism{
    void Students(){
        System.out.println("I'm Mohamed, I'm doing Website Projects");
    }
}

class Main{
    public static void main(String[] args) {
        RunTimePolymorphism obj;
        obj = new RunTimePolymorphism();
        obj.Students();
        School objs = new School();
        objs.Students();
        Parents objp = new Parents();
        objp.Students();

    }
}
