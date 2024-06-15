package Java_interview_Questions;

public class LinearSearchtest {
    public static void main(String[] args) {

    }
}

class LinearSearch{
    void linearsearch(int a[], int x){
        int flag = 0;
        for(int i=0; i<a.length; i++){
            if(x ==a[i]){
                flag =1;
            }
        }

        if(flag == 0){
            System.out.println("Key number " +x + " not found");
        }
    }
}
