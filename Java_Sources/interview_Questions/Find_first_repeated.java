package interview_Questions;

import java.util.ArrayList;
import java.util.HashSet;

public class Find_first_repeated {
    public static void main(String[] args) {
        String a = "Mohamed Bahir Hussain";
        HashSet<String> hs = new HashSet<>();
        ArrayList<String> al = new ArrayList<>();
        for(int i=0; i<a.length(); i++){
            char b = a.charAt(i);
            for(int j=i+1; j<a.length(); j++){
                if(b == a.charAt(j)){
                    hs.add(String.valueOf(a.charAt(j)));
                }
            }
        }
        System.out.println(hs);
    }
}
