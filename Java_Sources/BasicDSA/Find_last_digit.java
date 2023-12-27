package BasicDSA;

public class Find_last_digit {
    public static void main(String[] args) {
        String a= "5";
        String b = "4";
        int c = Integer.parseInt(a);
        int d = Integer.parseInt(b);
        int e = 1;
        for(int i=0; i<d; i++){
            e = e*c;
        }
        System.out.println(e);

        String f = String.valueOf(e);
        System.out.println(f.charAt(f.length()-1));


    }
}
