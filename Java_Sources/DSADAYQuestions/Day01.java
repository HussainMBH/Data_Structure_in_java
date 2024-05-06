package DSADAYQuestions;

import java.util.Arrays;
import java.util.HashSet;

public class Day01 {
    public static void main(String[] args) {
        int a[] = {2, 5, 8, 7, 6, 2, 3, 4, 5, 1,9,6,8,7,2,9};
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<a.length; i++){
            hs.add(a[i]);
        }
        System.out.println(hs);
        int ar[] = new int[hs.size()];
        int i=0;
       for( Integer j: hs){
           ar[i] = j;
           i++;
       }

        System.out.println(Arrays.toString(ar));
    }
}
