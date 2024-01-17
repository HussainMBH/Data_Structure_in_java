package DSAGFG.Basic;

/*
Given a number N. Count the number of digits in N which evenly divide N.

Note :- Evenly divides means whether N is divisible by a digit i.e. leaves a remainder 0 when divided.
* */

public class countdigits {

    public static void main(String[] args) {
        int i = evenlyDivides(23);
        System.out.println(i);
    }

    static int evenlyDivides(int N){
        int count = 0;
        int originalN = N;
        while(N>0){
            int lastdigit = N%10;

            if(lastdigit != 0 && originalN % lastdigit == 0){
                count++;
            }
            N = N / 10;
        }
        return count;
    }
}
