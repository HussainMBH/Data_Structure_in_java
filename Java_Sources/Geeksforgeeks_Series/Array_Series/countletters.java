package Geeksforgeeks_Series.Array_Series;

public class countletters {
    public static void main(String[] args) {
        String name = "Mohamed Bahir Hussain";
        int count =0;
        for(int i=0; i<name.length(); i++){
            if(name.charAt(i) != ' '){
                count++;
            }
        }

        System.out.println(count);
    }
}
