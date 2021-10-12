package advance.class29_heap.classroom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;


class Points implements Comparable<Points>{

    int sqrt;
    int index;

    public Points(int sqrt, int index){
        this.sqrt = sqrt;
        this.index = index;
    }

    @Override
    public int compareTo(Points o) {
        return this.sqrt-  o.sqrt;
    }

    @Override
    public String toString() {
        return "Points{" +
                "sqrt=" + sqrt +
                ", index=" + index +
                '}';
    }
}
public class BClosestPointToZero {

    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {

        PriorityQueue<Points> pq = new PriorityQueue<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int index = 0;
        for(ArrayList L : A){

            Integer x = (Integer) L.get(0);
            Integer y = (Integer) L.get(1);
             //int sqrt = (int)Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
            int sqrt =  (x *x )+ (y*y);
            pq.add(new Points(sqrt, index));
            index++;
        }

       for(int i=0; i<B; i++){
           Points p = pq.poll();
           res.add(A.get(p.index));
       }


        return res;
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<Integer> one  = new ArrayList<>(Arrays.asList(-4, 2));
        ArrayList<Integer> two  = new ArrayList<>(Arrays.asList(0,1));
        ArrayList<Integer> three  = new ArrayList<>(Arrays.asList(1,1));
        ArrayList<Integer> four  = new ArrayList<>(Arrays.asList(-2,1));
        ArrayList<Integer> five  = new ArrayList<>(Arrays.asList(3, 0));
        ArrayList<Integer> six  = new ArrayList<>(Arrays.asList(-2, -2));

        A.add(one);
        A.add(two);
        A.add(three);
        A.add(four);
        A.add(five);
        A.add(six);

        System.out.println(new BClosestPointToZero().solve(A, 4));





    }

}
