public class NumberIncrementAndDecrement {
    public static void main(String[] args) {
        for(int i=1, k=4; i<=9; i++){
            if(i<=5){
                System.out.print(i + "* ");
            }
            else {
                System.out.print(k + "@ ");
                k--;
            }
        }
    }
}
