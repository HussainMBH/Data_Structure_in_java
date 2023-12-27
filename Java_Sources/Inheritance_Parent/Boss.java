package Inheritance_Parent;

public class Boss extends Management {
    void CompanyBoss (){
        System.out.println("I'm a Boss");
        System.out.println("My name is Bahir Hussain");
    }
    public static void main(String[] args) {
        Boss objbs = new Boss();
        objbs.CompanyBoss();
        objbs.HR();
        objbs.staffdetails();
    }
}
