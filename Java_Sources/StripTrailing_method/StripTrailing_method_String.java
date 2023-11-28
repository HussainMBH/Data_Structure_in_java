package StripTrailing_method;

public class StripTrailing_method_String {
    public static void main(String[] args){
        String a = "Hardwork never fails    ";
        System.out.println(a.length());
       a = a.stripTrailing();
        System.out.println(a.length());
    }
}
