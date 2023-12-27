package Inheritance_Parent;

import Inheritance_Child.companyproducts;

public class Staff extends companyproducts {
   public void staffdetails(){
        System.out.println("I'm working as a Cashier.");
        System.out.println("My name is Bahir");
    }
    public static void main(String[] args) {
        Staff objsf = new Staff();
        objsf.staffdetails();
        objsf.products();
    }
}
