package DSAGFG.Array;

public class Seacrhelement {
    public static void main(String[] args) {
        int a[] = {5,8,9,3,6,4,8};
        int key = 4;
        for(int i=0; i<a.length; i++){
            if(a[i] == key){
                System.out.println("Your elment " + key + " found at " + i);
            }
        }
    }
}
