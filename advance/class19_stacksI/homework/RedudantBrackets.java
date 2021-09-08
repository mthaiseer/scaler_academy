package advance.class19_stacksI.homework;

import java.util.*;

public class RedudantBrackets {

    public int braces(String A) {

        Deque<Character> stack = new ArrayDeque<Character>();
        Set<Character> operands = new HashSet<>();
        operands.add('+');
        operands.add('-');
        operands.add( '*');
        operands.add( '/');

        for(int i=0; i<A.length(); i++){

            char c  = A.charAt(i);

            if(!operands.contains(c) && c != '(' && c != ')' ){
                continue;
            }

            if(operands.contains(c) || c == '('){
                stack.push(c);
            }else{

                if((c  == ')') && (stack.isEmpty())){
                    return 1;
                }

                if((c  == ')') && (!stack.isEmpty() && !operands.contains(stack.peek()))){
                    return 1;
                }else{

                    while (!stack.isEmpty() && !stack.peek().equals('(')){
                        stack.pop();
                    }

                    if(!stack.isEmpty() && stack.peek().equals('(')){
                        stack.pop();
                    }


                }

            }


        }
        return  0;
    }

    public static void main(String[] args) {
        System.out.println(new RedudantBrackets().braces("((a+b))"));
        System.out.println(new RedudantBrackets().braces("(a+(c+b))"));
        System.out.println(new RedudantBrackets().braces("(a+(b)-c)"));
        System.out.println(new RedudantBrackets().braces("(a+b-c))"));
        System.out.println(new RedudantBrackets().braces("a+b"));
    }


}
