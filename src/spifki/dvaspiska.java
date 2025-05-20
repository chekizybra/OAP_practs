package spifki;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class dvaspiska {
    public static void main(String[] args) {
        List<Integer> L = Arrays.asList(-3, -2, -7, -5, 0, -4, -1);
        List<Integer> L1 = new ArrayList<>();
        List<Integer> L2 = new ArrayList<>();

        for (int i = 0; i < L.size(); i++) {
            int x = L.get(i);
            if (x > 0) L1.add(i);
            else if (x < 0) L2.add(i);
        }
        System.out.println("положительные: " + L1);
        System.out.println("отрицательные: " + L2);
    }
}
