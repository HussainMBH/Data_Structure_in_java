package Java_question;

import java.util.Arrays;

public class Sortingjava {
    public static void main(String[] args) {
        int a[] = {4,8,9,6,7,5,3,2,1};
        int tmp = 0;
        BubbleSorting bs = new BubbleSorting();
        bs.bubblesorting(a, tmp);
        SelectionSorting ss = new SelectionSorting();
        ss.selectionsorting(a, tmp);

    }
}

class SelectionSorting{
    void selectionsorting(int a[], int tmp){
        System.out.println("Selection Sorting...");
        for(int i=0; i<a.length; i++){
            for(int j = i+1; j<a.length; j++){
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

class BubbleSorting{
    void bubblesorting(int a[], int tmp){
        System.out.println("Bubble Sorting...");
        for(int i=a.length-1; i>=0; i--){
            for(int j=0; j<i; j++){
                if(a[j] >a[j+1]){
                    tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}