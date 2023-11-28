package StripTrailing_method;

public class StripTrailing_method_String {
    public static void main(String[] args){
        String a = "Hardwork never fails    ";
        System.out.println(a);
        System.out.println(a.length());
       a = a.stripTrailing();
        System.out.println(a.length());

        StripTrailing_method_String objstrip = new StripTrailing_method_String();
        objstrip.StripTrailing();
    }

    void StripTrailing(){
        String a = "Hardwork never fails    ";
        int end =0;
        int count = 0;
        for(int i=a.length()-1; i>=0; i--){
            if(a.charAt(i) == ' '){
                continue;
            }
            else {
                end = i;
                break;
            }
        }
        for(int i=0; i<=end; i++){
            System.out.print(a.charAt(i));
            count++;
        }
        System.out.println();
        System.out.println(count); //checking StripTrailing is working or not
    }
}
