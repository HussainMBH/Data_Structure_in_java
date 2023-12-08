package Geeksforgeeks_Series.Array_Series;

import java.util.Arrays;

public class one_by_one_odd_and_even_number {
    public static void main(String[] args) {
        int a[] = { 8,6,3,1,7,5,10,2,4,9 };
        Arrays.sort(a);
        int tmp[] = a.clone();
        boolean flag = true;
        for(int i=0; i<a.length; i++){
            if(flag == true && tmp[i] % 2 == 0){
                a[i] = tmp[i];
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
