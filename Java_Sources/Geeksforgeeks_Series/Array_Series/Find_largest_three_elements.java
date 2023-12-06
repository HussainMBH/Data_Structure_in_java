package Geeksforgeeks_Series.Array_Series;

import java.util.ArrayList;
import java.util.Arrays;

public class Find_largest_three_elements {
    public static void main(String[] args) {
        int a[] = {10,50,80,400,60,70,900,500};
        ArrayList<Integer> al = new ArrayList<>();
        int maxi = Integer.MIN_VALUE;
        int scnd = Integer.MIN_VALUE;
        int thrd = Integer.MIN_VALUE;
        for(int i=0; i<=a.length - 1; i++){
            if(a[i] > maxi){
                thrd = scnd;
                scnd = maxi;
                maxi = a[i];
            }
            else if(a[i] > scnd){
                thrd = scnd;
                scnd = a[i];
            }
            else if(a[i] > thrd){
                thrd = a[i];
            }
        }
        System.out.println(maxi +" "+ scnd + " " + thrd);
    }
}
