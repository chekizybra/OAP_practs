package spifki;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class dobavlylka {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        int x = 5;
        int y = 100;

        //y после x
        int i = list.indexOf(x);
        if (i != -1) list.add(i + 1, y);

        System.out.println("После x: " + list);

        //y до x
        list = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9)); // сброс списка
        i = list.indexOf(x);
        if (i != -1) list.add(i, y);

        System.out.println("До x: " + list);
    }
}
