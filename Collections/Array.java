package Collections;

import java.util.*;

public class Array {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(4);
        list.add(2);
        list.add(9);

        System.out.println(list);
        System.out.println(list.get(2));
        
        list.set(0, 100);
        System.out.println(list);
    
        list.remove(3);
        System.out.println(list);
        System.out.println(list.contains(5));

    }
}
