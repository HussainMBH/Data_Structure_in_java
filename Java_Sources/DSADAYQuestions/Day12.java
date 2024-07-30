package DSADAYQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        System.out.println(" Enter few names ");
        Scanner scn = new Scanner(System.in);


        for(int i=0; i<5; i++){
            al.add(scn.nextInt());
        }
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);

    }
}
