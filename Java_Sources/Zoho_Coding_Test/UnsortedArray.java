package Zoho_Coding_Test;

import java.util.Arrays;

public class UnsortedArray {
    public static void main(String[] args) {
        int a[] = {9,6,7,2,1,5,3,4,8};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(a[a.length-2]);
    }
}
