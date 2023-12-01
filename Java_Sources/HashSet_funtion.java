import java.util.HashSet;

public class HashSet_funtion {
    public static void main(String[] args) {
        int a[] = {1,10,9,6,7,3,2,8,5,4,9,10,5,8};
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<a.length; i++){
            hs.add(a[i]);
        }
        System.out.println(hs);
    }
}
