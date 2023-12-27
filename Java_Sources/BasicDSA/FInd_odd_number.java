package BasicDSA;

import java.util.ArrayList;
import java.util.Collections;

public class FInd_odd_number {
    public static void main(String[] args) {
        int a[] = {5,8,9,4,3,6,1,2,7,10};
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<a.length; i++){
            if(a[i]%2 != 0){
                al.add(a[i]);
            }
        }
        Collections.sort(al);
        System.out.println(al);
    }
}
