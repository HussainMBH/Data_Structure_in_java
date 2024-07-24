package DSADAYQuestions.OOPDAY;

import Java_interview_Questions.Emloyee;

public class InheritanceOOPDay01 {
    public static void main(String[] args) {
        Encaps encaps = new Encaps();
        Poly poly = new Poly();

        // Accessing and changing managers using setManagers
        System.out.println("Initial Managers count: " + encaps.getManagers());
        encaps.setManagers(65);
        System.out.println("Updated Managers count: " + encaps.getManagers());

        // Testing the method in the Poly class
        poly.staffsCount();
        poly.staffsCount(30);

        // Testing the managers count in Poly class
        poly.managersCount(50);
        System.out.println("After calling managersCount method, Managers count: " + poly.getManagers());

        // Testing testManager method in Poly class
        poly.testManager();

    }
}
class Encaps{
    private  int managers = 25;
    public int getManagers() {
        return managers;
    }

    public void setManagers(int managers) {
        this.managers = managers;
    }


    void managersCount(int managers){

        System.out.println("Managers count " + (this.managers = managers));
    }
    void testManager(){
        System.out.println(managers);
    }


}
class Poly extends Encaps{

    int managersacces = getManagers();



    void staffsCount(){
        System.out.println("Staffs Count 15");
        System.out.println("get Managers count " + managersacces);
    }

    void staffsCount(int count){
        System.out.println(count);
    }
}

class phism extends Poly{
    void staffscount(){
        System.out.println("Staffs Count 15");
    }

    void staffscount(int count){
        System.out.println(count);
    }
}


abstract class inheritparent{

    abstract void managestaffs();
    void logbookaccess(){
        System.out.println("only Manager can access this book!");
    }
}

class inheritchild extends inheritparent{
    static void managecustomers(){
        System.out.println("Staffs want to manage all customers");
    }
    void managestaffs(){
        System.out.println("Chief Managers want to assist managers");
    }
}
