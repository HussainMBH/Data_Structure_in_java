package DSAGFG.Basic;

class sortingarray{
    int flag = 0;
    public void arrayfreq(int a[]){
        for(int i=0 ;i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i] == a[j]){
                   flag++;
                }

            }
            System.out.println(a[i]+" : " +flag);
            flag = 0;
        }
    }
}


public class sortingElementsArrayFrequency {

    public static void main(String[] args) {
        sortingarray obj = new sortingarray();
        int a[] = {2,4,6,4,2,4,2,8,9,7,4,2};
        obj.arrayfreq(a);
    }
}
