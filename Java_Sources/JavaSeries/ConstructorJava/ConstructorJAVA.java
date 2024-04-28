package JavaSeries.ConstructorJava;

public class ConstructorJAVA {

    int a;
    String name;

    int age;
    String secondname;
    public ConstructorJAVA(int ag, String nm){
        a = 10;
        name = "Bahir";

        age = ag;
        secondname = nm;
    }
    public static void main(String[] args) {
        ConstructorJAVA obj = new ConstructorJAVA(24, "Hussain"); //create object of Constructor class
        System.out.println(obj.a);
        System.out.println(obj.name);
        System.out.println(obj.secondname);
        System.out.println(obj.age);
    }
}
