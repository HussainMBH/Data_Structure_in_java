package Java_question;

import java.util.Arrays;

public class SearchingJava {
    public static void main(String[] args) {
        int a[] = {6,5,9,3,4,7,1,2,8};
        int tmp = 0;
        int key = 7;
        BinarySearch bs = new BinarySearch();
        int binaryanswer = bs.binarysearch(a, key, tmp);
        System.out.println(binaryanswer);
        LinearSearch ls = new LinearSearch();
        ls.linearsearch(a, key);
    }
}

class LinearSearch{
    void linearsearch(int a[], int key){
        int flag = 0;
        for(int i=0; i<a.length; i++){
            if(key == a[i]){
                System.out.println("Your key element " + a[i] + " found at " + i);
                flag = 1;
            }
        }
        if(flag == 0){
            System.out.println("Your key element not found here");
        }
    }
}

class BinarySearch{
    int binarysearch(int a[], int key, int tmp){
        for(int i = a.length-1; i>=0; i--){
            for(int j=0; j<i; j++){
                if(a[j]>a[j+1]){
                    tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(a));

        int first = 0;
        int last = a.length-1;
        while (first <last){
            int mid = (first + last)/2;
            if(key == a[mid]){
                return mid;
            } else if (key > a[mid]) {
                first = mid + 1;
            }
            else {
                last = mid -1;
            }
        }
        return -1;
    }
}