package Core_Java;

public class this_key_word {
    int num1;
    int num2;


    public this_key_word(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public int addition(int a, int b){
        num1 = a;
        num2 = b;
        int z = a+b;
        return z;
    }


    public static void main(String[] args){
       // this_key_word objthis = new this_key_word();
       // System.out.println(objthis.addition( 10, 20 + "Before using this key word "));
       // System.out.println(objthis.addcalculat(30,40));
        this_key_word obj = new this_key_word(60, 80);
        obj.marks();
    }

    void marks(){
        System.out.println("Marks: " + num1);
        System.out.println("Marks: " + num2);
    }
}
