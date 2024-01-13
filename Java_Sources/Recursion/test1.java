package Recursion;

public class test1 {

    static void printno(int i, int total){
        total = total+i;
        i++;
        if(i<=5){
            printno(i, total);
        }
        System.out.println(total);
    }
    public static void main(String[] args) {
        int total = 0;
        printno(1, total);
    }
}
