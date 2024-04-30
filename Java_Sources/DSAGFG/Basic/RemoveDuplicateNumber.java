package DSAGFG.Basic;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateNumber {
    public static void main(String[] args) {
        int a[] = {15, 5, 24, 12, 38, 71, 69};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        HashSet<Integer> hs = new HashSet<>();
//        for(int i=0; i<a.length; i++) {
//            hs.add(a[i] % 10);
//            hs.add(a[i] / 10);
//        }
//        System.out.println(hs);
        for(int i=0; i<a.length; i++){
            int t = a[i];
            while(t>0) {
                int r = t % 10;
                hs.add(r);
                t = t / 10;
            }
        }
        int ar[] = new int[hs.size()];
        int i=0;
        for (Integer j:hs){ //foreach loop
            ar[i] = j;
            i++;
        }
        System.out.println(Arrays.toString(ar));

        int aa[] = {5,8,3,1,4,7,9,2,6};
        for(int x:aa){
            System.out.println(x);
        }
    }
}
