package DSAGFG.Basic;

public class NoteCounter {

    public static void countcurrency(int amount){
        int a[] = {2000, 1000, 500, 200, 100, 50, 20, 10, 5, 1};
        int notecounter[] = new int[a.length];

        for(int i=0; i<a.length; i++){
            if(amount >= a[i]){
                notecounter[i] = amount/a[i];
                amount = amount%a[i];
            }
        }

        System.out.println("Currency Count -> ");
        for (int i=0; i<notecounter.length; i++){
            if(notecounter[i] != 0){
                System.out.println(a[i] + " : " + notecounter[i]);
            }
        }
    }

    public static void main(String[] args) {
        int amount = 4538;
        countcurrency(amount);
        int x = 450/200;
        System.out.println(x);
    }
}
