package Java_interview_Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class HashSetJava {
    public static void main(String[] args) {
        HashMapInterface hs = new HashMapInterface();
        hs.HasMapInter();
        LinkedHashMapcls ls = new LinkedHashMapcls();
        ls.linkedhashmap();
        TreeHashMapcls ts = new TreeHashMapcls();
        ts.treehasmap();
    }
}

class HashMapInterface{
    void HasMapInter(){
        Map<String,Integer> Fruits = new HashMap<>();
        Fruits.put("Apple", 25);
        Fruits.put("Orange", 35);
        Fruits.put("Mango", 45);
        System.out.println("HashMap Interface");

        for(String fruits : Fruits.keySet()){
            System.out.println(fruits + " = " + Fruits.get(fruits));
        }
        System.out.println(Fruits);
        System.out.println(Fruits.containsKey("Apple"));
        System.out.println(Fruits.containsValue(45));
        Fruits.remove("Orange");
        for(String fruits : Fruits.keySet()){
            System.out.println(fruits + " = " + Fruits.get(fruits));
        }
        System.out.println();
    }
}
class LinkedHashMapcls{
    void linkedhashmap(){
        Map<String,Integer> Fruits = new LinkedHashMap<>();
        Fruits.put("Apple", 25);
        Fruits.put("Orange", 35);
        Fruits.put("Avacado", 65);
        Fruits.put("Mango", 45);
        System.out.println("LinkedHashMap Interface");

        for(String fruits : Fruits.keySet()){
            System.out.println(fruits + " = " + Fruits.get(fruits));
        }
        System.out.println(Fruits);
        System.out.println(Fruits.containsKey("Apple"));
        System.out.println(Fruits.containsValue(45));
        Fruits.remove("Orange");
        for(String fruits : Fruits.keySet()){
            System.out.println(fruits + " = " + Fruits.get(fruits));
        }
        System.out.println();
    }
}

class TreeHashMapcls{
    void treehasmap(){
        Map<String,Integer> Fruits = new TreeMap<>();

        Fruits.put("Orange", 35);
        Fruits.put("Avacado", 65);
        Fruits.put("Mango", 45);
        Fruits.put("Apple", 25);
        System.out.println("TreeHashMap Interface");

        for(String fruits : Fruits.keySet()){
            System.out.println(fruits + " = " + Fruits.get(fruits));
        }
        System.out.println(Fruits);
        System.out.println(Fruits.containsKey("Apple"));
        System.out.println(Fruits.containsValue(45));
        Fruits.remove("Orange");
        for(String fruits : Fruits.keySet()){
            System.out.println(fruits + " = " + Fruits.get(fruits));
        }

    }
}