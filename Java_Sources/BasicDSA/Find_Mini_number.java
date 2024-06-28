package BasicDSA;

public class Find_Mini_number {
    public static void main(String[] args) {
        int a[] = {8,9,7,3,6,4,5,2,1};
        int min = a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println(min);
    }
}
