package advance.class12_sortingII.classroom;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class BClosestPointsOfOrigins {

    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        PriorityQueue<Edge> queue=new PriorityQueue<Edge>(10, new Comparator<Edge>() {
            public int compare(Edge edge1, Edge edge2) {
                if (edge1.getSqr() < edge2.getSqr()) return -1;
                if (edge1.getSqr() > edge2.getSqr()) return 1;
                return 0;
            }
        });

        int idx = 0;
        for (List list : A) {
            int x = (Integer) list.get(0);
            int y = (Integer) list.get(1);
           int res = (int) (Math.pow(x, 2) + Math.pow(y, 2));
           queue.add(new Edge(res, idx));
           idx++;
        }


        for(int i=0; i<B; i++){
            Edge edge = queue.poll();
           result.add(A.get(edge.getIndex()));

        }

        return result;
    }

    class Edge{
        int sqr;
        int index;

        public Edge(int sqr, int index) {
            this.sqr = sqr;
            this.index = index;
        }

        public int getSqr() {
            return sqr;
        }

        public void setSqr(int sqr) {
            this.sqr = sqr;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        @Override
        public String toString() {
            return "Edge{" +
                    "sqr=" + sqr +
                    ", index=" + index +
                    '}';
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();

        ArrayList<Integer> sub1 = new ArrayList<>();
        sub1.add(1);
        sub1.add(3);
        A.add(sub1);

        ArrayList<Integer> sub2 = new ArrayList<>();
        sub2.add(-2);
        sub2.add(2);
        A.add(sub2);

        System.out.println(new BClosestPointsOfOrigins().solve(A, 1));


    }

}
