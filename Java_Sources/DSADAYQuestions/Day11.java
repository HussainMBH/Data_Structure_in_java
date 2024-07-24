package DSADAYQuestions;

import java.util.Arrays;

public class Day11 {

    public static void main(String[] args) {
        int a[] = {7,4,2,5,1,9,3,6,8,10};
        int key = 5;
        int tmp = 0;
        int flag = 0;

        Sortings.insertsorting(a, tmp);
        Sortings sortings = new Sortings();
        sortings.bubblesorting(a, tmp);
        Searching.Linearsearch(a, key, flag);
        Searching searching = new Searching();
        searching.Binarysearch(a, key,flag, tmp);
    }

}

class Searching{
    static void Linearsearch(int a[], int key, int flag){
        for(int i=0; i<a.length; i++){
            if(a[i] == key){
                System.out.println("Found key element " + key + " at index of " + i);
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            System.out.println("Key element not found here");
        }
    }

    void Binarysearch(int a[], int key, int flag, int tmp){
        for(int i=a.length-1; i>=0; i--){
            for(int j=0; j<i; j++){
                if(a[j]>a[j+1]){
                    tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
        int start = 0;
        int ending = a.length-1;
        while (start<= ending){
            int mid = (start + ending)/2;
            if(a[mid] == key){
                System.out.println("Found key element " + key + " at index of " + mid);
                flag = 1;
                break;
            } else if (a[mid] < key) {
                mid = start+1;
            }else {
                mid = ending-1;
            }
        }
        if(flag == 0){
            System.out.println("Key not found at here.");
        }
    }
}

class Sortings{
    static void insertsorting(int a[], int tmp){
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

    void bubblesorting(int a[], int tmp){
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
