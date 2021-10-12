package advance.class29_heap.classroom;

import java.util.Collections;
import java.util.PriorityQueue;

public class MagicianAndChoclates {

    public int nchoc(int A, int[] B) {

        int MOD  = 1000000007;
        long  ans = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int x: B){
            pq.add(x);
        }

        for(int i=0; i<A; i++){

            if(pq.isEmpty() || pq.peek() == 0){
                break;
            }
            int c = pq.poll();
            ans = (ans %MOD + c%MOD)%MOD;
            pq.add(c/2);
        }

     return (int)ans;
    }

    public static void main(String[] args) {
        System.out.println(new MagicianAndChoclates().nchoc(3, new int[] {6, 5}));
        System.out.println(new MagicianAndChoclates().nchoc(5, new int[] {2, 4, 6, 8, 10}));
        System.out.println(new MagicianAndChoclates().nchoc(10, new int[] {2147483647, 2000000014, 2147483647 }));
    }

}
