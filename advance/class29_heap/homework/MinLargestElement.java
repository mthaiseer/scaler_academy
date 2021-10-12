package advance.class29_heap.homework;

import java.util.PriorityQueue;


class Pair implements Comparable<Pair>{

    int val;
    int index;

    public Pair(int val, int index){
        this.val = val;
        this.index = index;
    }


    @Override
    public int compareTo(Pair o) {
        return this.val - o.val;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "val=" + val +
                ", index=" + index +
                '}';
    }
}
public class MinLargestElement {

    public int solve(int[] A, int B) {

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int[] S = A.clone();

        int i =0;
        for(int x:A){

            pq.add(new Pair(x*2, i) );
            i++;

        }

        while (B > 0){

            Pair top = pq.poll();
            S[top.index] += A[top.index];

            top.val =  top.val+ A[top.index];
            pq.add(top);
            B--;
        }

        int ans = Integer.MIN_VALUE;
        for(int x: S){
            ans = Math.max(x, ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        //System.out.println(new MinLargestElement().solve(new int[] {5,1,4,2}, 5));
        //System.out.println(new MinLargestElement().solve(new int[] {1, 2, 3, 4}, 3));
        System.out.println(new MinLargestElement().solve(new int[] {5, 7, 8}, 9));
        System.out.println(new MinLargestElement().solve(new int[] {6257, 7396, 6462, 8360, 2553, 4838, 6403, 3742, 12, 456, 9748, 5820, 9849, 2977, 557, 9248, 5435, 3030, 6891, 7806, 7039, 8280, 8665, 3028, 17, 9070, 6592, 1902, 7548, 919, 233, 156, 4666, 6694, 8515, 7218, 7883, 4918, 960, 7894, 1725, 7059, 3713, 7925, 35, 621, 3524, 5469, 3651, 414, 9627, 7041, 5046, 8291, 69, 1414, 7360, 3012, 9668, 4908, 3930, 9900, 5063, 4947, 2945, 9930, 2165, 7179, 1199, 9476, 1425, 2923, 6534, 1489, 7199, 6568, 2110, 722, 8388, 5760, 7488, 8014, 9152, 8885, 6305, 5572, 298, 16, 8583, 6317, 1275, 8864, 2568, 2690, 3811, 5512, 2619, 5975, 9043, 169 }, 61802));
    }

}
