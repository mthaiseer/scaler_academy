package advance.class21_queue.classroom;

import java.util.*;

public class SlidingWindowMaximum {

    public int[] slidingMaximum(final int[] A, int B) {

        int windowStart =-1;
        Deque<Integer> queue = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();

        for(int widowEnd =0; widowEnd<A.length; widowEnd++){

            if(widowEnd >= B){
               windowStart++;
               int e = queue.peek();
               ans.add(e);
               if(!queue.isEmpty() &&A[windowStart] == queue.peek()){
                   queue.removeFirst();
               }

            }
            while(!queue.isEmpty() && queue.getLast() < A[widowEnd]){
                queue.removeLast();
            }
            queue.addLast(A[widowEnd]);
        }

        if(!queue.isEmpty()){
            ans.add(queue.peek());
        }



        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Arrays.stream(new SlidingWindowMaximum().slidingMaximum(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)).forEach(it->{
            System.out.print(it+  "  ");
        });
        System.out.println();
        Arrays.stream(new SlidingWindowMaximum().slidingMaximum(new int[]{1, 2, 3, 4, 2, 7, 1, 3, 6}, 6)).forEach(it->{
            System.out.print(it+  "  ");
        });
        System.out.println();
        Arrays.stream(new SlidingWindowMaximum().slidingMaximum(new int[]{1, 2, 3, 4}, 5)).forEach(it->{
            System.out.print(it+  "  ");
        });
        System.out.println();
        Arrays.stream(new SlidingWindowMaximum().slidingMaximum(new int[]{8, 7, -4, 10}, 5)).forEach(it->{
            System.out.print(it+  "  ");
        });
        System.out.println();

    }
}
