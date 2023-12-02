import java.util.Arrays;

public class FInd_Minimum_and_Maximum_Element {
    public static void main(String[] args) {
        int a[] = {5,9,15,150,3,4,1,75,80};
        int mini = a[0];
        int maxi = a[0];
        for (int i=0; i<a.length; i++){
            if(mini>a[i]){
                mini = a[i];
            }
            if(maxi <a[i]){
                maxi = a[i];
            }
        }
        System.out.println(mini);
        System.out.println(maxi);
        FInd_Minimum_and_Maximum_Element obj = new FInd_Minimum_and_Maximum_Element();
        obj.findclosest();
    }

    void findclosest(){
        int a[] = {5,9,15,150,3,4,75,80,90,0,-5,-7};
        int mini = Integer.MAX_VALUE;
        int clst = 0;
        int maximini = 0;
        for (int i=0; i<a.length; i++){
            if(a[i]<mini && a[i] != 0){
                    mini = a[i];
                    clst = mini;
            }
            if(clst <0){
                maximini = clst;
                clst = Math.max(clst, a[i]);
            }
        }
        System.out.println(clst);
    }
}
