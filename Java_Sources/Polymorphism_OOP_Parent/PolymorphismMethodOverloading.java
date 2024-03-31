package Polymorphism_OOP_Parent;


public class PolymorphismMethodOverloading {
    public void product(){
        System.out.println("It's a Biscuits");
    }

    public void product(int a){
        System.out.println("It's a Soap");
    }

    public static void main(String[] args) {
        System.out.println("It's Polymorphism and it's a Method Overloading..." +
                "Same Name, Same Class and Different Arguments...");
        PolymorphismMethodOverloading p = new PolymorphismMethodOverloading();
        p.product();
        p.product(10);
    }
}
