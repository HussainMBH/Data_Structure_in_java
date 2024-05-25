package DSAGFG.Basic;

public class FindMissingNumber {
    public static void main(String[] args) {
        int a[] = {4,1,3,2,6,9,7,8,10};
        int l = a.length;
        int b = 0;
        int ttl = 0;
        for(int num : a){
            b = b + num;
        }
        for(int i =1; i<a.length; i++){
            ttl = ttl + i;
        }

        System.out.println(b);
        int acrt = a.length + 1;
        System.out.println(a.length);
        System.out.println(acrt);
        System.out.println(ttl);
        System.out.println(ttl - acrt);

    }
}
