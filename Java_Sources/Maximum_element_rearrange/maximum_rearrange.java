package Maximum_element_rearrange;

import java.util.ArrayList;
import java.util.HashSet;

public class maximum_rearrange {
    public static void main(String[] args) {
        int a = 315649;
        int num=102502; // int number
        ArrayList<Integer> al = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();


        while (num > 0) {
            hs.add(num % 10);
            num = num / 10;
        }

        System.out.println(hs);
    }
}
