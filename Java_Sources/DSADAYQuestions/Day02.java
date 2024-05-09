package DSADAYQuestions;

import java.util.HashSet;

class findduplicate{
     void findduplic(int a[]){
         HashSet<Integer> hs = new HashSet<>();
         HashSet<Integer> duplicates = new HashSet<>();

         for (int i = 0; i < a.length; i++) {
             if (!hs.add(a[i])) {
                 duplicates.add(a[i]);
             }
         }

         // Print the duplicates
         for (int duplicate : duplicates) {
             System.out.print(duplicate + " ");
         }
    }

    void finddup(int a[]){
         for(int i=0; i<a.length; i++){

                 for(int j= i+1; j<a.length; j++){
                     if(a[i] == a[j]){
                         System.out.print(a[i] + " ");
                         break;
                     }
                 }

         }
    }
}


public class Day02 {
    public static void main(String[] args) {
        int a[] = {2,4,1,2,6,4,5,7,9,3,3,5,1,9,6};
        findduplicate objfind = new findduplicate();
        objfind.findduplic(a);
        System.out.println();
        objfind.finddup(a);
    }
}
