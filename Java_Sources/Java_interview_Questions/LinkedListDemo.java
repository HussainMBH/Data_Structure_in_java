package Java_interview_Questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(10);

        ll.add(23);
        ll.add(30);
        System.out.println(ll);
        System.out.println(ll.getLast());
        System.out.println(ll.get(2));
        System.out.println(ll.size());

    }
}
