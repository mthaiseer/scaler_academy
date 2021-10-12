package advance.class21_queue.classroom;

import java.util.Deque;
import java.util.LinkedList;

public class TaskScheduling {

    public int solve(int[] A, int[] B) {

        Deque<Integer> deque = new LinkedList<>();
        int count =0;

        for(int i=0; i<A.length; i++){
            deque.addLast(A[i]);
        }

        for(int i=0; i<B.length; i++){

            while(B[i] != deque.peek()){

                int temp = deque.pop();
                count++;
                deque.addLast(temp);

            }
            deque.pop();
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

       Deque<Integer> deque = new LinkedList<>();
        System.out.println(new TaskScheduling().solve(new int[]{2, 3, 1, 5, 4}, new int[]{1, 3, 5, 4, 2}));
        System.out.println(new TaskScheduling().solve(new int[]{1}, new int[]{1}));
    }

}
