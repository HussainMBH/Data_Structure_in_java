public class Countdigit {
    public static void main(String[] args) {
        int a = 1234567;

        int count = 0;
        while (a>0){
            int b = a%10;
            if(b != 0){
                count++;
            }
            a = a/10;
        }
        System.out.println(count);


        long c = 3;
        long d = 10;
        for(int i=1; i<d; i++){
            c = c*c;
        }
        System.out.println(c);

        System.out.println(c%10);
    }
}
