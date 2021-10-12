package advance.class21_queue.classroom;

import java.util.ArrayDeque;
import java.util.Deque;

public class PerfectNumbers {

    public String solve(int A) {

        if(A == 1){
            return "11";
        }

        if(A== 2){
            return "22";
        }

        Deque<String> deque = new ArrayDeque<>();
        deque.addLast("1");
        deque.addLast("2");

        int N  = A -2;
        int k  =0;
        while(k<N){

            String x = deque.pop();
            k++;
            deque.addLast(x+1);
            if(k ==N ) break;

            k++;
            deque.addLast(x+2);
            if(k ==N ) break;

        }
        String S = deque.removeLast();
        StringBuffer buffer = new StringBuffer(S);
        buffer.reverse();
        S = S+ buffer.toString();
        return S;

    }

    public static void main(String[] args) {
        System.out.println(new PerfectNumbers().solve(3));
        System.out.println(new PerfectNumbers().solve(2));
        System.out.println(new PerfectNumbers().solve(9));
    }

}
