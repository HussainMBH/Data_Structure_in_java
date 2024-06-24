package Java_interview_Questions;

import java.util.Arrays;

public class SearchClass {
    public static void main(String[] args) {
        int a[] = {5,9,7,4,6,3,2,1};
        LinearSearch ls = new LinearSearch();
        int answer = ls.linearsearch(a, 3);
        System.out.println(answer);
        BinarySearch bs = new BinarySearch();
        int binaryanswer = bs.binarySearch(a, 5);
        System.out.println(binaryanswer);
    }
}
class LinearSearch {
    int linearsearch(int a[], int key) {
        for (int i = 0; i < a.length; i++) {
            if (key == a[i]) {
                return i;
            }
        }
        return -1;
    }
}
class BinarySearch{
    int binarySearch(int a[], int key){
        int tmp = 0;
        for(int i=a.length; i>=0; i--){
            for(int j=0; j<i-1; j++){
                if(a[j]> a[j+1]){
                    tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        int start = 0;
        int end = a.length -1;
        while (start<= end){
            int mid = (start + end)/2;
            if(key == a[mid]){
                return mid;
            }
            else if(key >a[mid]){
                start = mid +1;
            }
            else {
                end = mid -1;
            }
        }
        return -1;
    }
}