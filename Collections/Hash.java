package Collections;

import java.util.*;

//Basic
public class Hash {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, 10);
        map.put(1, 10);
        map.put(2, 10);
        System.out.println(map);
        System.out.println(map.get(0));
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue(10));
        System.out.println(map.getOrDefault(4, 20));
    }
}
