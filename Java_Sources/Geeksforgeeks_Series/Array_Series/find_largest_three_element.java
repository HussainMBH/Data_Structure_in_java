package Geeksforgeeks_Series.Array_Series;

import java.util.Arrays;

public class find_largest_three_element {
    public static void main(String[] args) {
        int a[] = {10,50,80,400,60,70,900,500};
        Arrays.sort(a);

        int b = a.length-1;
        System.out.println("Last one = " + a[b]);
        System.out.println("Last two = " + a[b-1]);
        System.out.println("Last third = " + a[b-2]);
    }
}
