import java.util.Arrays;

public class sorting_array_maxi_to_mini {
    public static void main(String[] args) {
        int a[] = {10,25,05,500,250,150,600,750,450,300};
        for(int i=0; i<a.length; i++){
            int min = i;
            for(int j=i+1; j<a.length; j++){
                if(a[j] > a[min]){
                    min = j;
                }
            }
            int tmp = a[min];
            a[min] = a[i];
            a[i] = tmp;
        }
        System.out.println(Arrays.toString(a));
    }
}
