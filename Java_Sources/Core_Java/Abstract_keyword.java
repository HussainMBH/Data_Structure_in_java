package Core_Java;

public class Abstract_keyword {
    public static void main(String [] args){
        student objstd = new student();
        objstd.display();
        objstd.show();
    }

}

abstract class teacher{
    abstract void display(); // in here just declaration abstract method
    void show(){
        System.out.println("Show Teacher's details");
    }
}

class student extends teacher{
    void display(){
        System.out.println("Abstract method in derived class");
    }
}
