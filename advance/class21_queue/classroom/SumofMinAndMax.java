package advance.class21_queue.classroom;

import java.util.Deque;
import java.util.LinkedList;

public class SumofMinAndMax {

    public int solve(int[] A, int B) {

        int MOD = 1000000007;
        int windowStart =0;
        Deque<Integer> maxQueue = new LinkedList<>();
        Deque<Integer>minQueue = new LinkedList<>();
        long result = 0;
        int windowEnd =0;

        for( windowEnd =0; windowEnd <A.length; windowEnd++){
           // int e = A[windowEnd];


            if(windowEnd >= B){
                result += A[minQueue.peek()]+ A[maxQueue.peek()];
                result %= 1000000007;
                result += 1000000007;
                result %= 1000000007;

                int firstElement = A[windowStart];
                if(maxQueue.isEmpty() == false && A[maxQueue.peek()] == firstElement){
                    maxQueue.removeFirst();
                }

                if(minQueue.isEmpty() == false && A[minQueue.peek()] == firstElement){
                    minQueue.removeFirst();
                }

                windowStart++;


            }
            while (!maxQueue.isEmpty() && A[maxQueue.getLast()] < A[windowEnd]){
               maxQueue.removeLast();
            }
            maxQueue.addLast(windowEnd);

            while (!minQueue.isEmpty() && A[minQueue.getLast()] > A[windowEnd]){
                minQueue.removeLast();
            }
            minQueue.addLast(windowEnd);
        }

        if(maxQueue.isEmpty() == false && minQueue.isEmpty() == false){
            result += A[minQueue.peek()]+ A[maxQueue.peek()];
            result %= 1000000007;
            result += 1000000007;
            result %= 1000000007;
        }
        return (int)result%MOD;
    }

    public static void main(String[] args) {
        System.out.println(new SumofMinAndMax().solve(new int[]{2, 5, -1, 7, -3, -1, -2}, 4));
        System.out.println(new SumofMinAndMax().solve(new int[]{1,2,3,4}, 2));
       System.out.println(new SumofMinAndMax().solve(new int[]{2000000000,1000000000,2000000080,2000000001}, 3));
    }

}
