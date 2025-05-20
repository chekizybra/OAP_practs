package spifki.ochered;
import java.util.*;
public class och2 {
    public static void main(String[] args) {
        Queue<Integer> z = new LinkedList<>(Arrays.asList(5, 4, 14));
        Queue<Integer> v = new LinkedList<>(Arrays.asList(2, 2, 88));
        Queue<Integer> zv = new LinkedList<>();

        while (!z.isEmpty() && !v.isEmpty()) {
            zv.add(z.poll());
            zv.add(v.poll());
        }

        System.out.println("Объединённая очередь: " + zv);
    }
}
