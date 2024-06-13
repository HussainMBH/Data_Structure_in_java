package Java_interview_Questions;

import java.util.Arrays;

public class sortedarray {
    public static void main(String[] args) {
        int a[] = {8, 5, 6, 4, 2, 1, 3, 7, 9};
        sortfunction objsort = new sortfunction();
        bubblesortfunction objbub = new bubblesortfunction();
        objbub.bubblesort(a);
        objsort.selectionsort(a);
    }
}

class bubblesortfunction{
    void bubblesort(int a[]){
        int tmp=0;
        for(int i=a.length-1; i>0; i--){
            for(int j=0; j<i-1; j++){
                if(a[j]>a[j+1]){
                    tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
class sortfunction{
    void selectionsort(int a[]){
        int tmp =0;
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]>a[j]){
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}