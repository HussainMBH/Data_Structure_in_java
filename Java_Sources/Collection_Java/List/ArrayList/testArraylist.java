package Collection_Java.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class testArraylist {
    public static void main(String[] args) {
        int a[] = {3,5,7,4,1,6,9,8,2,5,6,1};
        int tmp = 0;
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i] > a[j]){
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
