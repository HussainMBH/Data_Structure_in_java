package DSAGFG.Array;

public class FInd_Minimum {
    public static void main(String[] args) {
        int a[] = {5,100,3,9,1,4,6};
        int min = a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println(min);
    }
}
