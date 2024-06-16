package Java_interview_Questions;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClasses {
    public static void main(String[] args) {
        trySetClasses ts = new trySetClasses();
        ts.HashSetClass();
        ts.setclasses();
        ts.TreeSetClass();
    }
}

class trySetClasses{
    void setclasses(){
        Set<Integer> st = new HashSet<>();
        System.out.println("Set Class Example");
        st.add(5);
        st.add(9);
        st.add(5);
        st.add(15);
        st.add(4);
        System.out.println(st);
    }
    void HashSetClass(){
        HashSet<Integer> hs = new HashSet<>();
        System.out.println("HashSet Class Example");
        hs.add(5);
        hs.add(9);
        hs.add(5);
        hs.add(15);
        hs.add(4);
        System.out.println(hs);

    }

    void TreeSetClass(){
        TreeSet<Integer> tr = new TreeSet<>();
        System.out.println("TreeSet Class");
        tr.add(5);
        tr.add(9);
        tr.add(5);
        tr.add(15);
        tr.add(4);
        System.out.println(tr);
    }

}
