package Geeksforgeeks_Series.Array_Series;

import java.util.Arrays;

public class find_second_largest {
    public static void main(String[] args) {
        int a[] = {10,50,80,400,60,70,900,500};
        Arrays.sort(a);
        System.out.println("Second largest element is " + a[a.length-2]);
    }
}
