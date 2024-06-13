package DSAGFG.Basic;

public class DivideTwoIntegers {
    public int divider(int dividend, int divisor){
        int answer = dividend/divisor;
        return answer;
    }

    public static void main(String[] args) {
        DivideTwoIntegers obj = new DivideTwoIntegers();
        int a = obj.divider(-50,10);
        System.out.println(-1 * a);

    }
}
