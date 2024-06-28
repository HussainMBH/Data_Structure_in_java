package DSADAYQuestions;

import java.util.Arrays;

public class Day6 {
    public static void main(String[] args) {
        ChildInheritanceOOP ci = new ChildInheritanceOOP();
        RemoveDuplicate rd = new RemoveDuplicate();
        int a[] = {4,7,9,8,3,6,5,1,4,8,9};

        System.out.println("The array after removing duplicate elements is ");
        int k = rd.removeduplicate(a);
        for (int g = 0; g < k; g++) {
            System.out.print(a[g] + " ");
        }

        ci.childInheritance();
        ci.parentInheritance();
    }
}


class RemoveDuplicate{
    int removeduplicate(int a[]){

        int tmp = 0;
        for(int i=a.length-1; i>=0; i--){
            for(int j=0; j<i; j++){
                if(a[j] > a[j+1]){
                    tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
       int i = 0;
       for(int j=1; j<a.length; j++){
           if(a[i] != a[j]){
               i++;
               a[i] = a[j];
           }
       }
       return i+1;

    }
}

class ParentInheritanceOOP{
    int accountbalance = 500000;
    void parentInheritance(){
        System.out.println("I'm your dad");

    }
}

class ChildInheritanceOOP extends ParentInheritanceOOP{
    void childInheritance(){
        int sonsmoney = accountbalance;

        System.out.println("I'm your son");
        System.out.println(sonsmoney);
    }
}
