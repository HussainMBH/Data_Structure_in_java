package Collection_Java.List.ArrayList;

import java.util.*;

public class studentslist {

    static List<Integer> stdlist = new ArrayList<>();
    static Map<Integer, student>sts = new HashMap<>();

    static Map<Integer, studentdetails> stdlists = new HashMap<>();
    public static void main(String[] args) {

    }

    static void addname(){




    }

    public void showsname(){
        for (student st : sts.values()){
            System.out.println(st.name);
            System.out.println(st.grade);
        }

    }
}
