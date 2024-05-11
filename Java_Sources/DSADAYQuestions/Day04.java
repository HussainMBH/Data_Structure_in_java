package DSADAYQuestions;

public class Day04 {
    public void FindCurrency(int amount){
        int a[] = {2000, 1000, 500, 200, 100, 50, 20};
        int notes[] = new int[a.length];
        for(int i=0; i<a.length; i++){
            if(amount>=a[i]){
                notes[i] = amount/a[i];
                amount = amount % a[i];
            }
        }

        for(int i=0; i<notes.length; i++) {
            if (notes[i] != 0) {
                System.out.println(a[i] + " = " + notes[i]);
            }
        }
    }

    public static void main(String[] args) {
        Day04 obj = new Day04();
        obj.FindCurrency(4500);
    }
}
