package advance.class19_stacksI.classroom;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParanthesis {

    public int solve(String A) {

        Deque<Character> stack = new ArrayDeque<Character>();

        for(int i=0; i<A.length(); i++){

            char c  = A.charAt(i);

            if(c ==  '{' || c == '(' || c == '['){
                stack.push(c);
            }else  if(c == '}' && (stack.isEmpty() || stack.peek() != '{')){
               return 0;
            }else if(c == ')' && (stack.isEmpty() || stack.peek() != '(')){
                return 0;
            }else if(c == ']' && (stack.isEmpty() || stack.peek() != '[')){
                return 0;
            }else{
                stack.pop();
            }
        }
        return stack.isEmpty()? 1: 0;
    }

    public static void main(String[] args) {
//        System.out.println(new BalancedParanthesis().solve("()"));
//        System.out.println(new BalancedParanthesis().solve("[(]"));
//        System.out.println(new BalancedParanthesis().solve("{([])}"));
//        System.out.println(new BalancedParanthesis().solve("(){"));
//        System.out.println(new BalancedParanthesis().solve("()[]"));
        System.out.println(new BalancedParanthesis().solve("))))))))"));
        System.out.println(new BalancedParanthesis().solve("(((("));
    }



}
