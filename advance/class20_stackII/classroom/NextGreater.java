package advance.class20_stackII.classroom;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class NextGreater {

    public int[] nextGreater(int[] A) {

        Deque<Integer> stack = new ArrayDeque<>();
        int B[] = new int[A.length];

        for(int i=A.length-1; i>=0; i--){

            while(stack.isEmpty() == false && stack.peek()<=A[i]){
                stack.pop();
            }
            B[i] = stack.isEmpty() ? -1: stack.peek();
            stack.push(A[i]);

        }
        return B;
    }

    public static void main(String[] args) {
        Arrays.stream(new NextGreater().nextGreater(new int[] {1,2,3,4,5})).forEach(it->{
            System.out.print( it + " ");
        });
        System.out.println();

        Arrays.stream(new NextGreater().nextGreater(new int[] {5,4,3,2,1})).forEach(it->{
            System.out.print( it + " ");
        });
        System.out.println();

        Arrays.stream(new NextGreater().nextGreater(new int[] {4, 5, 2, 10})).forEach(it->{
            System.out.print( it + " ");
        });
        System.out.println();

        Arrays.stream(new NextGreater().nextGreater(new int[] {39, 27, 11, 4, 24, 32, 32, 1 })).forEach(it->{
            System.out.print( it + " ");
        });
        System.out.println();
    }

}
