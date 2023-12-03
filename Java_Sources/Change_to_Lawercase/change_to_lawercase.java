package Change_to_Lawercase;

public class change_to_lawercase {
    public static void main(String[] args) {
        String s = "MOhaMed bAhiR HUssAiN";
        for(int i=0; i< s.length(); i++){
            char ch = s.charAt(i);
            if(ch>= 'A' && ch<= 'Z'){
                ch = (char) (ch +32);
                System.out.print(ch);
            }
            else {
                System.out.print(ch);
            }
        }
    }
}
