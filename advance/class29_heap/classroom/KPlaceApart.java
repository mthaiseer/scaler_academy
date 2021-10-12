package advance.class29_heap.classroom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class KPlaceApart {

    public int[] solve(int[] A, int B) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        List<Integer> resList = new ArrayList<>();
        for(int i=0; i<B; i++){

            pq.add(A[i]);

        }

        for(int i=B; i<A.length; i++){
            pq.add(A[i]);
            int p = pq.poll();
            resList.add(p);

        }

        while(pq.isEmpty() == false){
            resList.add(pq.poll());

        }


        return resList.stream().mapToInt(Integer::intValue).toArray();

    }

    public static void main(String[] args) {

        Arrays.stream(new KPlaceApart().solve(new int[]{1, 40, 2, 3}, 2)).forEach(it ->{
            System.out.print( it +  " ");
        });
        System.out.println();
        Arrays.stream(new KPlaceApart().solve(new int[]{6,5,3,2,8,10, 9}, 3)).forEach(it ->{
            System.out.print( it +  " ");
        });
    }

}
