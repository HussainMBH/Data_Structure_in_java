package remove_unwanted_space;

public class remove_unwanted_space {
    public static void main(String[] args) {
        String a = "Mohamed      Bahir       Hussain";
        boolean onespace = false;
        for(int i=0; i< a.length(); i++){
            char ch = a.charAt(i);

            if(ch != ' '){
                System.out.print(ch);
                onespace = true;
            }
            else if(onespace == true) {
                System.out.print(ch);
                onespace = false;
            }
        }
    }
}
