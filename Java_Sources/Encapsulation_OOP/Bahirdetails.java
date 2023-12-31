package Encapsulation_OOP;

public class Bahirdetails {
    public int atmcard = 782284;
    protected int pin = 1234;
    public static void main(String[] args) {
        Bahirdetails bhd = new Bahirdetails();
        Hussaindetails hsd = new Hussaindetails();

        System.out.println(bhd.atmcard);
        hsd.workdetails();
    }
}
