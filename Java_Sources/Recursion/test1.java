package Recursion;

public class test1 {

    static void printno(int i){
        System.out.println(i);
        i++;
        if(i<=15){
            printno(i);
        }
    }
    public static void main(String[] args) {
        printno(8);
    }
}
