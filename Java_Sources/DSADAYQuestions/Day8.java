package DSADAYQuestions;

import java.util.Arrays;

public class Day8 {
    public static void main(String[] args) {
        int a[] = {8,7,4,1,5,3,2,9,5};
        int key = 5;
        int tmp = 0;
        SearchingDay8 sd = new SearchingDay8();
        sd.linearsearch(a, key);
        sd.binarysearch(a, key, tmp);
    }
}

class SearchingDay8{
    void linearsearch(int a[], int key){
        for(int i=0; i<a.length; i++){
            if(a[i] == key){
                System.out.println("Your key element " + key + " found at " + i);
            }
        }
    }

    void binarysearch(int a[], int key, int tmp){
        for(int i=a.length-1; i>=0; i--){
            for(int j=0; j<i; j++){
                if(a[j] > a[j+1]){
                    tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(a));

        int first = 0;
        int last = a.length-1;
        while (first<last){
            int mid = (first+last)/2;
            if(a[mid] == key){
                System.out.println("Your key element " + key + " found at " + mid);
                break;
            } else if (key> mid) {
                first = mid+1;
            }
            else {
                last = mid-1;
            }
        }
    }
}
