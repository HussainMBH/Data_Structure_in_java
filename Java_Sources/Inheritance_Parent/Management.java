package Inheritance_Parent;
import Inheritance_Child.companyproducts;


public class Management extends Staff {
    void HR(){
        System.out.println("I'm a HR in this company");
        System.out.println("My name is Hussain");
    }

    public static void main(String[] args) {
        Management objmg = new Management();
        objmg.HR();

        objmg.staffdetails();
    }
}
