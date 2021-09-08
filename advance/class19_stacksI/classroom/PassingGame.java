package advance.class19_stacksI.classroom;

import java.util.ArrayDeque;
import java.util.Deque;

public class PassingGame {


    public int solve(int A, int B, int[] C) {

        Deque<Integer> stack = new ArrayDeque<Integer>();
        stack.push(B);

        for(int i=0; i<A; i++){

            int next = C[i];
            if(next ==  0){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.push(next);
            }
        }

      return stack.isEmpty() == true ? -1:   stack.peek();
    }

    public static void main(String[] args) {
        System.out.println(new PassingGame().solve(10, 23,new int[] {86, 63, 60, 0, 47, 0, 99, 9, 0, 0} ));
        System.out.println(new PassingGame().solve(1, 1,new int[] {2} ));
        System.out.println(new PassingGame().solve(0, 1,new int[] {} ));
    }

}
