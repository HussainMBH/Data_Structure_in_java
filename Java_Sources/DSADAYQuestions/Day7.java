package DSADAYQuestions;

public class Day7 {
    public static void main(String[] args) {
        int a[] = {4, 9, 7, 6, 5, 3, 8, 2, 1};
        int key = 15;
        int tmp = 0;
        SearchingFunctions sf = new SearchingFunctions();
        int answer = sf.LinearSearch(a, key);
        System.out.println("Returned index: " + answer);
    }
}

class SearchingFunctions {
    int LinearSearch(int a[], int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i; // Return the index where the key is found
            }
        }
        return -1; // Return -1 if the key is not found
    }


    int binarysearch(int a[], int key, int tmp){

    }
}
