package Geeksforgeeks_Series.Array_Series;

import java.util.Arrays;

public class move_zero_to_end {
    public static void movezero(int a[], int n){
        int count = 0;
        for(int i=0; i<n; i++){
            if(a[i] != 0){
                a[count] = a[i];
                count++;
            }
        }
        while (count<n){
            a[count] = 0;
            count++;
        }
    }

   public static void main(String[] args) {
        int a[] = {1,0,5,9,0,8,7,0,0,6,4,3,2};
        int n = a.length;
        movezero(a, n);
       System.out.println(Arrays.toString(a) + " ");
    }
}
