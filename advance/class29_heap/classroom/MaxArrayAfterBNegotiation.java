package advance.class29_heap.classroom;

import java.util.PriorityQueue;

public class MaxArrayAfterBNegotiation {

    public int solve(int[] A, int B) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int count  = B;

        for(int i=0; i<A.length; i++){
            pq.add(A[i]);
        }

        for(int i=0; i<B; i++){

            if(pq.peek() < 0){
                Integer top = pq.poll();
                top =   Math.abs(top);
                pq.add(top);
                count--;

            }

        }

        if(count > 0 && count % 2  != 0){
            Integer top = pq.poll();
            top = -top;
            pq.add(top);
        }

        int sum  =0 ;
        while(pq.isEmpty() == false){

            sum+= pq.poll();

        }
        return sum;
    }

    public static void main(String[] args) {
        //System.out.println(new MaxArrayAfterBNegotiation().solve(new int[] {12, -14, 8, -7 ,-6, 13}, 5 ));
//        System.out.println(new MaxArrayAfterBNegotiation().solve(new int[] {24, -68, -29, -9, 84}, 4 ));
//        System.out.println(new MaxArrayAfterBNegotiation().solve(new int[] {57, 3, -14, -87, 42, 38, 31, -7, -28, -61}, 10));
        System.out.println(new MaxArrayAfterBNegotiation().solve(new int[] {-18, -79, -54, -12, 77, -73, -27, -46, -8}, 9));
    }

}
