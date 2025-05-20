package spifki.ochered;
import java.util.*;
public class och3 {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>(Arrays.asList(1, 4, 6));
        Queue<Integer> q2 = new LinkedList<>(Arrays.asList(2, 3, 5, 7));
        Queue<Integer> result = new LinkedList<>();

        while (!q1.isEmpty() && !q2.isEmpty()) {
            if (q1.peek() <= q2.peek()) {
                result.add(q1.poll());
            } else {
                result.add(q2.poll());
            }
        }

        // Добавляем оставшиеся элементы
        result.addAll(q1);
        result.addAll(q2);

        System.out.println("Отсортированная объединённая очередь: " + result);
    }
}
