package DSAGFG.Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortInSpecificOrder {
    public static void main(String[] args) {
        int a[] = {5,8,3,1,6,9,4,2,10,7};
        //
        System.out.println(Arrays.toString(a));
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<a.length; i++){
            if(a[i] %2 !=0){
                al.add(a[i]);
                a[i] = 0;
            }
        }
        System.out.println(Arrays.toString(a));
        Collections.sort(al);
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int x = 0;
        for(int i=al.size()-1; i>=0; i--){
            a[x] = al.get(i);
            x++;
        }
        System.out.println(Arrays.toString(a));
    }
}
