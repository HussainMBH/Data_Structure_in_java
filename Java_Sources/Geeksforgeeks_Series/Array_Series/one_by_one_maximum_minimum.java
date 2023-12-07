package Geeksforgeeks_Series.Array_Series;

import java.util.Arrays;

public class one_by_one_maximum_minimum {
    public static void main(String[] args) {
        int a[] = { 8,6,3,1,7,5,10,2,4,9 };
        Arrays.sort(a);
        int tmp[] = a.clone();
        int small = 0;
        int larg = a.length-1;
        boolean flag = true;
        for(int i=0; i<a.length; i++){
            if(flag == true){
                a[i] = tmp[larg--];
            }
            else {
                a[i] = tmp[small++];
            }
            flag = !flag; //If flag is initially true, after !flag, it becomes false.
        }
        System.out.println(Arrays.toString(a));
    }
}
