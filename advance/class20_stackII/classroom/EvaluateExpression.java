package advance.class20_stackII.classroom;

import java.util.ArrayDeque;
import java.util.Deque;

public class EvaluateExpression {

    public int evalRPN(String[] A) {

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < A.length; i++) {

            String s = A[i];
            if (s != null && s.equals("+")) {

                int x = stack.pop();
                int y = stack.pop();
                int z = x + y;
                stack.push(z);

            } else if (s != null && s.equals("-")) {
                int x = stack.pop();
                int y = stack.pop();
                int z = y - x;
                stack.push(z);
            } else if (s != null && s.equals("*")) {
                int x = stack.pop();
                int y = stack.pop();
                int z = x * y;
                stack.push(z);


            } else if (s != null && s.equals("/")) {
                int x = stack.pop();
                int y = stack.pop();
                int z = y / x;
                stack.push(z);
            } else {
                stack.push(Integer.valueOf(A[i]));
            }
        }
        return stack.isEmpty() ? 0 : stack.pop();
    }

    public static void main(String[] args) {
       // System.out.println(new EvaluateExpression().evalRPN(new String[]{"2", "1", "+", "3", "*"}));
        System.out.println(new EvaluateExpression().evalRPN(new String[]{"4", "13", "5", "/", "+"}));
    }
}
