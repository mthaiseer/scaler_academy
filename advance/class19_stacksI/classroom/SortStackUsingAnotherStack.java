package advance.class19_stacksI.classroom;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SortStackUsingAnotherStack {

    public int[] solve(int[] A) {

        if(A == null){
            return null;
        }

        Deque<Integer> stack = new ArrayDeque<Integer>();
        Deque<Integer> auxStack = new ArrayDeque<Integer>();

        for(int i=0; i< A.length; i++){

            int x = A[i];
            while(!stack.isEmpty() && x> stack.peek()){
                auxStack.push( stack.pop());
            }

            stack.push(x);
            while(!auxStack.isEmpty()){
                stack.push(auxStack.pop());
            }


        }

        int res[] = new int[stack.size()];
        int k =0;
        while(!stack.isEmpty()){
            res[k] = stack.pop();
            k++;
        }
        return res;
    }

    public static void main(String[] args) {
        Arrays.stream(new SortStackUsingAnotherStack().solve(new int[]{5,1})).forEach(it->{
            System.out.print( it+  "  ");
        });

        System.out.println();
        Arrays.stream(new SortStackUsingAnotherStack().solve(new int[]{5, 17, 100, 11})).forEach(it->{
            System.out.print( it+  "  ");
        });
        System.out.println();
        Arrays.stream(new SortStackUsingAnotherStack().solve(new int[]{5, 4, 3, 2, 1})).forEach(it->{
            System.out.print( it+  "  ");
        });

        System.out.println();
        Arrays.stream(new SortStackUsingAnotherStack().solve(new int[]{})).forEach(it->{
            System.out.print( it+  "  ");
        });

        System.out.println();
        Arrays.stream(new SortStackUsingAnotherStack().solve(null)).forEach(it->{
            System.out.print( it+  "  ");
        });
    }
}
