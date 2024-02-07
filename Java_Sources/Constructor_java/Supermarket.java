package Constructor_java;

public class Supermarket {

    String name;
    int price, discount;
    public Supermarket(String name, int price, int discount){
        this.name = name; // with this is a global variable, without this is a Local Variable
        this.price = price;
        this.discount = discount;
//        System.out.println("This product name is " + name);
//        System.out.println("This product price is " + price + " Rupees With " + discount+ " Rupees Discount.");
    }

    public static void main(String[] args) {
        Supermarket product1 = new Supermarket("Biscuits", 50, 8);
        product1.sell();
        product1.giveback();
    }

//    public void giveback(){
//        System.out.println("You bought " + name + ".");
//        System.out.println("That price is " + price + " with " + discount + " Rupees Discount.");
//    }
//
//    public void sell(){
//        System.out.println("This Product name is " + name);
//        System.out.println("This Product price is " + price + " Rupees with " + discount + " Rupees Discount.");
//    }
}
