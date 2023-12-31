package Polymorphism_OOP_Parent;

public class Manager extends employees {
    public void employee(){
        System.out.println("Hello guys");
    }
    public static void main(String[] args) {
        employees emp = new employees();
        emp.employee();
    }
}
