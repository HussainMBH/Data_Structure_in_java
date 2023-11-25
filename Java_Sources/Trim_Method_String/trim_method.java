package Trim_Method_String;

import java.util.Arrays;

public class trim_method {
    public static void main(String[] args){
        String name = "      Bahir Hussain     ";
        System.out.println("Before Trim: " + name);
        System.out.println("After Trim: " + name.trim());
        trim_method tmobj = new trim_method();
        tmobj.trimfunction();
    }

    public void trimfunction(){
        String sentence = "     Hardwork Never Fails       ";
        System.out.println("Senence length befor: " + sentence.length());
        int f=0, l = sentence.length() - 1;
        int n=0;
        boolean firstletter = false, lastletter = false;
        for(int i=0; i<sentence.length(); i++){
            if (sentence.charAt(i) == ' ' && firstletter == false){
                f++;
            }
            else if (firstletter == false){
                firstletter = true;
            }

            if(sentence.charAt(l) == ' ' && lastletter == false){
                l--;
            }
            else if(lastletter == false){
                lastletter = true;
            }
            if(firstletter == true && lastletter == true){
                break;
            }

        }
        for(int i=f; i<=l; i++){
            System.out.print(sentence.charAt(i));
            n++;
        }
        System.out.println();
        System.out.println(n);
        //System.out.println(Arrays.toString(sentence.charAt()));

    }
}
