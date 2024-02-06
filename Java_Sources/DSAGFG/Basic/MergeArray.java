package DSAGFG.Basic;

import java.util.ArrayList;

public class MergeArray {
    public static void main(String[] args) {
        int a[] = {1,3,4,5,0,8,0,6};
        int b[] = {7,2,4,6,0,4,0};
        ArrayList<Integer> ab = new ArrayList<>();
        for(int i=0; i<a.length; i++){
            if(a[i] !=0){
                ab.add(a[i]);
            }

        }
        for(int i=0; i<b.length; i++){
            if(b[i] !=0){
                ab.add(b[i]);
            }
        }

        System.out.println(ab);
    }
}
