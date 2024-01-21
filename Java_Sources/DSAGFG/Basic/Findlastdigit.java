package DSAGFG.Basic;

public class Findlastdigit {
    public static void main(String[] args) {
        finddigit();
    }

    static void finddigit(){
        long a = 3;
        long b = 6;
        long c = a;
        for(int i=1; i<b; i++){
            a = a*c;
        }
        System.out.println(a);
        long bln = a%10;
        System.out.println(bln);
    }
}
