package class13_problemsolving02.classroom;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class SlidingWindowMaximum {

    public int[] slidingMaximum(final int[] A, int B) {


        return null;

    }

    public static void main(String[] args) {

        if(3 > 6 ){
            System.out.println("print me ");
        }
        SlidingWindowMaximum obj = new SlidingWindowMaximum();
       int arr[] = obj.slidingMaximum(new int[] {6,3,7,1,2,1,0}, 3);
       // int arr[] = obj.slidingMaximum(new int[] {1, 3, -1, -3, 5, 3, 6, 7}, 3);
        //int arr[] = obj.slidingMaximum_TLE(new int[] {1, 2, 3, 4, 2, 7, 1, 3, 6}, 11);
//        for(int x: arr){
//            System.out.print(x + " ");
//        }
    }

    public int[] slidingMaximum_TLE(final int[] A, int B) {

        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(3, Collections.reverseOrder());
        if(B > A.length){
            int[] result = new int[1];
            for(int a: A){
                queue.offer(a);
            }
            result[0] = queue.peek();
            return result;
        }

        int left =0;
        int resIndex =0;
        int K  = (A.length - B)+1;
        int res [] = new int[K];

        for(int i=0; i <A.length ; i++ ){

            queue.offer(A[i]);
            if(i >= B-1){
                int max = queue.peek();
                res[resIndex] = max;
                resIndex+=1;

                queue.remove(A[left]);
                left++;
            }
        }
        return res;

    }

}
