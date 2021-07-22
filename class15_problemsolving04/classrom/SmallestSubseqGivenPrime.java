package class15_problemsolving04.classrom;

import java.util.*;

public class SmallestSubseqGivenPrime {

    public int[] solve(int A, int B, int C, int D) {

        List<Integer> result = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Set<Integer> set = new HashSet<>();
        int multiplier =1;

        for(int i=0; i<D; i++){

            int a1 = multiplier* A;
            if(!set.contains(a1)){
                set.add(a1);
                pq.add(a1);
            }

            int b1 = multiplier* B;
            if(!set.contains(b1)){
                set.add(b1);
                pq.add(b1);
            }

            int c1 = multiplier* C;
            if(!set.contains(c1)){
                set.add(c1);
                pq.add(c1);
            }

            int minElement = pq.poll();
            multiplier = minElement;
            result.add(minElement);
        }

        int[] res = new int[result.size()];
        int count =0;
        for(int x: result){
            res[count] = x;
            count++;
        }


        return res;
    }

    public static void main(String[] args) {
        SmallestSubseqGivenPrime obj = new SmallestSubseqGivenPrime();
        //int R[] = obj.solve(2,3,5,5);
       //int R[] = obj.solve(2,3,7,3);
       int R[] = obj.solve(3,11,7,50);
        for (int x: R){
            System.out.print(x + " ");

        }

    }

}
