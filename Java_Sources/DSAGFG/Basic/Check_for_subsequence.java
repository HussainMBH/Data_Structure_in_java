package DSAGFG.Basic;

public class Check_for_subsequence {
    public boolean subseq(String A, String B){
        int j = 0;
        for(int i=0; i<B.length(); i++){
            if(A.charAt(j) == B.charAt(i)){
                j++;
            }
        }
        return (j == A.length());
    }
    public static void main(String[] args) {
        Check_for_subsequence obj = new Check_for_subsequence();
        String A = "MBH";
        String B = "ACBOLH";
        boolean result = obj.subseq(A,B);
        System.out.println("Is A subsequence of B? " + result);
    }
}
