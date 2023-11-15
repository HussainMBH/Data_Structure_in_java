package Core_Java;

public class this_key_word {
    int num1;
    int num2;
    public int addition(int a, int b){
        num1 = a;
        num2 = b;
        int z = a+b;
        return z;
    }
    public int addcalculat(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
        int z = num1+num1;
        return z;
    }

    public static void main(String[] args){
        this_key_word objthis = new this_key_word();
       // System.out.println(objthis.addition( 10, 20 + "Before using this key word "));
        System.out.println(objthis.addcalculat(30,40));
    }
}
