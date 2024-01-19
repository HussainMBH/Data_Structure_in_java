package BasicDSA;

public class Reverse_Int {
    public static void main(String[] args) {
        reverseint();
    }

    static void reverseint(){
        int a = 23456700;
        int rev = 0;
        while (a>0){
            int last = a%10;
            rev = rev*10 + last;
            a = a/10;
        }
        System.out.println(rev);
    }
}
