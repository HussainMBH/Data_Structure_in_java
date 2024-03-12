package DSAGFG.Basic;

public class Odd_or_Even_Program_Without_module_Operator {
    public static void main(String[] args) {
        //it's using find odd or even without using module operator
        /*
        can find using Bit wise operator
        * 7 => 0 1 1 1  6 => 0 1 1 0
               0 0 0 1       0 0 0 1
            -> 0 0 0 1     ->0 0 0 0
        * */

        System.out.println(10&1);
    }
}
