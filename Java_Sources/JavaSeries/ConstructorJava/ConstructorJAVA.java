package JavaSeries.ConstructorJava;

public class ConstructorJAVA {

    int a;
    String name;
    public ConstructorJAVA(){
        a = 10;
        name = "Bahir";
    }
    public static void main(String[] args) {
        ConstructorJAVA obj = new ConstructorJAVA(); //create object of Constructor class
        System.out.println(obj.a);
        System.out.println(obj.name);
    }
}
