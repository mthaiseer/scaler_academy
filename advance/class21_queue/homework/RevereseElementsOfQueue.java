package advance.class21_queue.homework;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class RevereseElementsOfQueue {

    public int[] solve(int[] A, int B) {
        Deque<Integer> queue = new ArrayDeque<>();
        Deque<Integer> stack1 = new ArrayDeque<>();
        Deque<Integer> stack2 = new ArrayDeque<>();


        for(int x: A){
            queue.addLast(x);
        }

        int N =0;
        while (N <B){
            queue.removeFirst();
            stack1.push(A[N]);
            N++;
        }

        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }

        while(!stack2.isEmpty()){
            queue.addFirst(stack2.pop());
        }

        int k =0;
        int arr[] = new int[queue.size()];
        while(!queue.isEmpty()){
            arr[k] = queue.removeFirst();
            k++;
        }

        return arr;
    }

    public static void main(String[] args) {
        Arrays.stream(new RevereseElementsOfQueue().solve(new int[]{1,2,3,4,5}, 3)).forEach(it->{
            System.out.print(it+ " ");
        });

        System.out.println();
        Arrays.stream(new RevereseElementsOfQueue().solve(new int[]{5, 17, 100, 11}, 2)).forEach(it->{
            System.out.print(it+ " ");
        });
    }

}
