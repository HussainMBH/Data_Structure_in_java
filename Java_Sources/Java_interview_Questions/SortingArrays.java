package Java_interview_Questions;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {
        int a[] = {7,4,6,1,3,2,5,8,9};
        BubbleSort bs = new BubbleSort();
        bs.bubblesort(a);
        SelectionSorting ss = new SelectionSorting();
        ss.selectionsorting(a);
    }
}

class BubbleSort{
    void bubblesort(int a[]){
        System.out.println("Bubble Sorting Arrays");
        int tmp = 0;
        for(int i=a.length-1; i>=0; i--){
            for(int j=0; j<i-1; j++){
                if(a[j]> a[j+1]){
                    tmp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}

class SelectionSorting{
    void selectionsorting(int a[]){
        System.out.println("Selection Sorting Arrays");
        int tmp = 0;
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