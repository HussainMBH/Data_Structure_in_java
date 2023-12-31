package Encapsulation_OOP_child;
import Encapsulation_OOP.Bahirdetails;
public class Mohamed extends Bahirdetails{
    int matmcard = 9874;

    public static void main(String[] args) {
        Bahirdetails bhd = new Bahirdetails();
        System.out.println(bhd.atmcard);
        Mohamed mhd = new Mohamed();
        System.out.println(mhd.pin);
    }
}
