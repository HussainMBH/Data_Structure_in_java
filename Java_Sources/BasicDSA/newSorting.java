package BasicDSA;

import java.util.Arrays;

public class newSorting {
    public static void main(String[] args) {
        int a[] = {8,9,7,3,6,4,5,2,1};
        int tmp = 0;
        BubbleSorting bs = new BubbleSorting();
        bs.bubblesorting(a, tmp);
    }
}

class BubbleSorting{
    void bubblesorting(int a[], int tmp){
        for(int i=a.length-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(a[j]> a[j+1]){
                    tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
