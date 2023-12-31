import java.util.Arrays;

public class Remove_Element {
    public static void main(String[] args) {
        int b[] = new int[11];
        int a[] = {5,8,3,1,7,2,5,4,8,5,2};
        int key = 5;
        for(int i=0; i<a.length; i++){
            if(a[i] != key){
                b[i] = a[i];
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
