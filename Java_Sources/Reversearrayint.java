import java.util.Arrays;

public class Reversearrayint {
    public static void main(String[] args) {
        revesearray();
    }

    static void revesearray(){
        int a[] = {3,9,7,5,1,2,4,6,7,2,9,3,10};
        for(int i=0; i<a.length; i++){
            int max = i;
            for(int j=i; j<a.length; j++){
                if(a[j] > a[max]){
                    max = j;
                }
            }
            int tmp = a[max];
            a[max] = a[i];
            a[i] = tmp;
        }
        System.out.println(Arrays.toString(a));
    }
}
