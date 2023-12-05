package String_Startwith;

public class string_startwith {
    public static void main(String[] args) {
        String a = "Hello Mohamed Bahir Hussain";
        String b = "Hello";
        boolean result = a.startsWith(b);
        System.out.println(result);

        string_startwith  obj = new string_startwith();
        obj.stringwordcheck();
    }

    void stringwordcheck(){
        String a = "Hello Mohamed Bahir Hussain";
        String b = "Hello Mohamed";
        int count  = 0;
       for(int i=0; i<= b.length() - 1; i++){
           if(a.charAt(i) == b.charAt(i)){
               count++;
               continue;
           }
           else {
               System.out.println("Both Strings are not same");
               break;
           }
       }
       if(count == b.length()){
           System.out.println("Both strings are same");
       }
    }
}
