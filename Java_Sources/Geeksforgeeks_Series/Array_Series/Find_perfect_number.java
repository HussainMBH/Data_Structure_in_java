package Geeksforgeeks_Series.Array_Series;

public class Find_perfect_number {
    public static void main(String[] args) {
        int n = 6;
        int l = 0;

        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.println(i);
                l = l+i;

            }
        }
        System.out.println(l);
        l = l-n;
        if (l == n){
            System.out.println("It's True");
        }
        else {
            System.out.println("It's false");
        }
    }
}
