package spifki;

import java.util.*;


public class maxdeist {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,3,4,623,5,32,9));

        Integer max = Collections.max(list);
        list.remove(max);


        System.out.println("После удаления максимального: " + list);
    }
}
