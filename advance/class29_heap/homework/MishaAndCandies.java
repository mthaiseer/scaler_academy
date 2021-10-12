package advance.class29_heap.homework;

import java.util.PriorityQueue;

public class MishaAndCandies {


    public int solve(int[] A, int B) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int x : A){
            pq.add(x);
        }

        int totalEaten  = 0;


        while(pq.isEmpty() == false && pq.peek() <= B){

            int top = pq.poll();
            int availableToEat = (int)Math.floor(top/2);
            totalEaten+=availableToEat;
            int remaining = top - availableToEat;


            if(pq.size()>= 1){

                int nextTop =  pq.poll();
                nextTop = nextTop+ remaining;
                pq.add(nextTop);
            }
        }
        return totalEaten;
    }

    public static void main(String[] args) {
        System.out.println(new MishaAndCandies().solve(new int[]{3, 2, 3}, 4));
       // System.out.println(new MishaAndCandies().solve(new int[]{1,2,1}, 2));
        //System.out.println(new MishaAndCandies().solve(new int[]{9, 818, 174, 237, 892, 109, 522, 27, 59, 336, 605, 865, 714, 86, 708, 535, 138, 948, 836, 287, 179, 754, 466, 856, 153, 53, 958, 951, 262, 341, 769, 491, 772, 509, 336, 120, 98, 805, 169, 984, 520, 447, 256, 266, 348, 351, 60, 563, 45, 638, 29, 479, 400 }, 852));
        System.out.println(new MishaAndCandies().solve(new int[]{705 }, 895));
        System.out.println(new MishaAndCandies().solve(new int[]{324, 458, 481, 167, 939, 444, 388, 612, 943, 890, 953, 403, 653, 136, 168, 163, 186, 471  }, 231));
    }

}
