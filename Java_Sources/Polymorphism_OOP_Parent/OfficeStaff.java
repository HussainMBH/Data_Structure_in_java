package Polymorphism_OOP_Parent;

class employees{
    void employee(){
        String name = "Bahir";
        String department = "HR";
        System.out.println(name);
        System.out.println(department);
    }

    void employee(String name){
         String department = "IT";
        System.out.println(name);
        System.out.println(department);
    }
}

public class OfficeStaff {
    public static void main(String[] args) {
        employees emp = new employees();
        emp.employee();
        emp.employee("Mohamed");
    }
}
