package JavaSeries.OOP.Polymorphism;

public class CompileTimePolymorphism {
     private String Sub1;
     private String Sub2;
    void Subjects(String Sub1, String Sub2 ){

        System.out.println("First Subject is " +  Sub1);
        System.out.println("Second Subject is " + Sub2);
    }

    void Subjects(String Sub1){
        System.out.println("This is Main Subject " + Sub1);
    }

}

class Mainsubjects{
    public static void main(String[] args) {
        CompileTimePolymorphism objcmpl = new CompileTimePolymorphism();
        objcmpl.Subjects("Maths");
        objcmpl.Subjects("Maths", "English");
    }
}
