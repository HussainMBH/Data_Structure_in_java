package Geeksforgeeks_Series.Array_Series;

import java.util.Arrays;

public class find_three_largest {
    public static void main(String[] args) {
        int a[] = {10,50,80,400,60,70,900,500};
        Arrays.sort(a);
        for(int i= a.length-1; i>= a.length-3; i--){
            System.out.println(a[i]);
        }
    }
}
