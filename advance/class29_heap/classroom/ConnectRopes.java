package advance.class29_heap.classroom;

import java.util.PriorityQueue;

public class ConnectRopes {

    public int solve(int[] A) {

        //add all to priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int x: A){
            pq.add(x);
        }

        int sum =0;
        while (pq.size() != 1){

            int p1 = pq.poll();
            int p2 = pq.poll();

            sum += (p1+ p2);
            pq.add(p1+p2);


        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new ConnectRopes().solve(new int[]{1, 2, 3, 4, 5}));
        System.out.println(new ConnectRopes().solve(new int[]{5, 17, 100, 11}));
    }

}
