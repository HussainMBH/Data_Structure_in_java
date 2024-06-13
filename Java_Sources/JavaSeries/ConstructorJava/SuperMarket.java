package JavaSeries.ConstructorJava;

public class SuperMarket {
    String productname;
    int price, discount;

    void ProductDetails(){
//        this.productname = productname;
//        this.price = price;
//        this.discount = discount;
        System.out.println("Product Name: " + productname );
        System.out.println("Product Price: " + price);
        System.out.println("Product Discount: " + discount);
    }

    public static void main(String[] args) {
        SuperMarket prod1 = new SuperMarket();
        prod1.productname = "Biscuits";
        prod1.price = 250;
        prod1.discount = 50;
        SuperMarket prod2 = new SuperMarket();
        SuperMarket prod3 = new SuperMarket();
        prod1.ProductDetails();
        prod2.ProductDetails();
        prod3.ProductDetails();
    }
}
