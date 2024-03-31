package BasicDSA;

public class moveevennumtofront {
    public static void main(String[] args) {
        int a [] = {5,7,4,8,6,1,2};
        int tmp = 0;
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i] % 2 == 0){
                    tmp = a[i];

                }
            }
        }
    }
}
