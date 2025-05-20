package spifki;

import java.util.Stack;

public class reshotochkabackspase {
    public static void main(String[] args) {
        String eshkere = "гоойййда#####";
        Stack<Character> stack = new Stack<>();
        for (char i : eshkere.toCharArray()) {
            if (i == '#') {
                stack.pop();
            } else {
                stack.push(i);
            }
        }
        StringBuilder r = new StringBuilder();
        for (char c : stack) r.append(c);
        System.out.println(r.toString());
    }
}
