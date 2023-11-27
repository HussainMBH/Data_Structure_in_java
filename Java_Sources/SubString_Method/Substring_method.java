package SubString_Method;

import java.util.Scanner;

public class Substring_method {
    public static void main(String[] args){
        Substring_method objsub = new Substring_method();
        String s = "abcdefghijklmnopqrstuvwxyz";
        s = s.substring(5, 10);
        System.out.println(s);
        objsub.manualsubstring();
    }

    void manualsubstring(){
        String s = "abcdefghijklmnopqrstuvwxyz";
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Starting position number:");
        int startpos = scn.nextInt();
        System.out.println("Enter Ending position number:");
        int endposition = scn.nextInt();

        for(int i=startpos; i<endposition; i++){
            System.out.print(s.charAt(i) + " ");
        }
    }
}
