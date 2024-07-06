package DSADAYQuestions;

public class Day10 {
    public static void main(String[] args) {
        int a[] = {1,2,2,3,4,4,4,5,6,6,7};
        RemoveDuplicates.removeduplicate(a);


    }
}

class findevenorodd{
    
}

class RemoveDuplicates{
    static void removeduplicate(int a[]){
        if(a.length == 0){
            System.out.println(0);
            return;
        }
        int j = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[j] != a[i]) {
                j++;
                a[j] = a[i];
            }
        }
        for (int k = 0; k <= j; k++) {
            System.out.print(a[k] + " ");
        }

    }
}