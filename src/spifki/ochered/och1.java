package spifki.ochered;

import java.util.*;

public class och1 {
    public static void main(String[] args) {
        int[] zov = {3, 5, 7, 9, 4, 6, 8};
        Queue<Integer> z = new LinkedList<>();
        for (int x : zov) z.add(x);

        while (z.peek() % 2 != 0) {
            z.poll();
        }

        System.out.println("Очередь после удаления: " + z);
    }
}
