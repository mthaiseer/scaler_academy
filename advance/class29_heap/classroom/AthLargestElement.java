package advance.class29_heap.classroom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class AthLargestElement {

    public int[] solve(int A, int[] B) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        List<Integer> ans  =  new ArrayList<>();

        for(int i=0; i<=A-1; i++){

            pq.add(B[i]);
            if(i == A-1){
                ans.add(pq.peek());
            }else{
                ans.add(-1);
            }
        }

        for(int i=A; i<B.length; i++){

            if(pq.peek() < B[i]){
                pq.poll();
                pq.add(B[i]);
            }
            ans.add(pq.peek());

        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Arrays.stream(new AthLargestElement().solve(4, new int[]{1,2,3,4,5,6})).forEach(it->{
            System.out.print(it +  " ");
        });

        System.out.println();

        Arrays.stream(new AthLargestElement().solve(2, new int[]{15, 20, 99, 1})).forEach(it->{
            System.out.print(it +  " ");
        });
    }

}
