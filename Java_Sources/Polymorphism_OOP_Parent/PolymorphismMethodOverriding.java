package Polymorphism_OOP_Parent;

class Product{
    public void items(){
        System.out.println("It's a Soap");
    }
}

public class PolymorphismMethodOverriding extends Product{
    public void items(){
        System.out.println("It's a Biscuits");
    }
    public static void main(String[] args){
        PolymorphismMethodOverriding obj = new PolymorphismMethodOverriding();
        obj.items();

        Product p = new Product();
        p.items();
    }
}
