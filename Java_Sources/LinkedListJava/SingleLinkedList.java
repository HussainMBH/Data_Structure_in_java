package LinkedListJava;

import java.util.LinkedList;

public class SingleLinkedList {
    public static void main(String[] args) {
        LinkedList lk = new LinkedList();
       lk.add(50);
       lk.add(20);
       lk.add(30);
        System.out.println(lk);
        System.out.println(lk.getLast());
    }
}
