package Java_question;

import java.util.ArrayList;
import java.util.Scanner;

public class testproject02 {
    public static void main(String[] args) {
        employeeadd obj = new  employeeadd();
        employeeadd.empl();
    }
}

class employeeadd{

    static ArrayList<Integer> al = new ArrayList<>();
    static void empl(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your ID Number ");
        int k = scn.nextInt();
       // al = scn.nextInt();
        System.out.println(k);
    }
}
