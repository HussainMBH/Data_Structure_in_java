package JavaSeries.MethodOverriding;

public class Child extends Parent{
    public static void main(String[] args) {
        Child ch = new Child();
        ch.get_admissiion();
    }

    void get_admissiion(){
        System.out.println("Doctor");
    }
}
