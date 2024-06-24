package Java_interview_Questions;

import java.util.Arrays;

public class SearchBinary {
    public static void main(String[] args) {
        int a[] = {6,5,9,3,4,7,1,2,8};
        Searchbinary sb = new Searchbinary();
        sb.searchbinary(a, 5);
    }
}

class Searchbinary{
    int searchbinary(int a[], int key){
        int tmp = 0;
        for(int i=a.length-1; i>=0; i--){
            for(int j=0; j<i-1; j++){
                if(a[j]>a[j+1]){
                    tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(a));


        int first = 0;
        int end = a.length-1;
        while (first < end){
            int mid = (first + end)/2;
            if(key == a[mid]){
                return mid;
            } else if (key > a[mid]) {
                first = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
