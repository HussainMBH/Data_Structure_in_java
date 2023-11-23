package Find_Missing_Number_Array;

public class Find_Missing_Number_using_array_add {
    public static int missingnumber(int []a, int l, int ll){
        int sum =0;
        for(int i=0; i<l; i++){
            sum = sum + a[i];
        }
        return ll*(ll+1)/2 - sum;
    }

    public static void main(String[] args){
        int a[] = {1,2,4,5};
        int l = a.length;
        int ll = 5;
        int ans = missingnumber(a, l, ll);
        System.out.println(ans);
    }
}
