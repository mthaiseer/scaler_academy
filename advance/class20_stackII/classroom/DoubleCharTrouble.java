package advance.class20_stackII.classroom;

import java.util.ArrayDeque;
import java.util.Deque;

public class DoubleCharTrouble {

    public String solve(String A) {

        if(A == null) {
            return null;
        }

        Deque<Character> aux = new ArrayDeque<Character>();
        Deque<Character> stack = new ArrayDeque<Character>();
        StringBuffer buffer  = new StringBuffer();

        for(int i=0; i<A.length(); i++){

            char c  = A.charAt(i);

            if(!stack.isEmpty() && stack.peek().equals(c)){
                stack.pop();
            }else{
                stack.push(c);
            }


        }

        while(!stack.isEmpty()){
            aux.push(stack.pop());
        }

        while(!aux.isEmpty()){
            buffer.append(aux.pop());
        }
        return buffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(new DoubleCharTrouble().solve("abccbc"));
        System.out.println(new DoubleCharTrouble().solve("ab"));
    }

}
