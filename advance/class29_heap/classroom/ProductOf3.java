package advance.class29_heap.classroom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class ProductOf3 {

    public ArrayList<Integer> solve(ArrayList<Integer> A) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Integer> res = new ArrayList<>();

        for(int i=0; i<A.size(); i++){

            pq.add(A.get(i));

            if(i< 2){
                res.add(-1);
            }else{

                int max1 = pq.poll();
                int max2 = pq.poll();
                int max3 = pq.poll();

                int p  = max1* max2* max3;
                res.add(p);

                pq.add(max1);
                pq.add(max2);
                pq.add(max3);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(new ProductOf3().solve(A));
    }

}
