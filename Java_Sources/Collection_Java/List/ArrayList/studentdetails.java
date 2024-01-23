package Collection_Java.List.ArrayList;

import java.util.Scanner;

public class studentdetails {
   addstudent slist = new addstudent();

    public static void main(String[] args) {
        addname();
    }

    static void addname(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your name and Grade");
        String name = scn.next();
        String grade = scn.next();

        student s = new student(name, grade);
    }

    static void showname(){

    }
}
