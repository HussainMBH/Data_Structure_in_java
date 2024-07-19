package DSADAYQuestions.OOPDAY;

public class InheritanceOOPDay01 {
    public static void main(String[] args) {
        inheritchild.managecustomers();
        inheritchild objchild = new inheritchild();
        objchild.logbookaccess();
        objchild.managestaffs();
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
