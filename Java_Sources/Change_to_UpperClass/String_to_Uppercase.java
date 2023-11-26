package Change_to_UpperClass;

public class String_to_Uppercase {
    public static void main(String[] args){
        String s = "vskjhsfb125@&%$sdsv";
        s = s.toUpperCase();
        System.out.println(s);

        String_to_Uppercase obj = new String_to_Uppercase();
        obj.changetouppercase();
    }

    public void changetouppercase(){
        String s = "vskjhsfb125@&%$sdsv";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>= 'a' && ch<= 'z'){
                ch = (char) (ch-32); // type casting
                System.out.print(ch);
            }
            else {
                System.out.print(ch);
            }
        }
    }
}
