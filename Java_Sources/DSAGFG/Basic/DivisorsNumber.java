package DSAGFG.Basic;

import java.util.ArrayList;

public class DivisorsNumber {
    public static void main(String[] args) {
        int a = 10;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=1; i<=a; i++){
            if(a%i ==0){
                al.add(i);
            }
        }
        System.out.println(al);
    }
}
