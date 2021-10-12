package advance.class20_stackII.homework;

import java.util.ArrayDeque;
import java.util.Deque;

public class LargestRectangleInHistogram {

    public int largestRectangleArea(int[] A) {

        int size = A.length;
        int maxArea = 0;
        int i=0;
        Deque<Integer> stack = new ArrayDeque<>();

        while (i < size){

            while (i < size && (stack.isEmpty() || A[stack.peek()] <= A[i])){
                stack.push(i);
                i++;
            }

            while(stack.isEmpty() == false && (i == size || A[stack.peek()] >A[i]  )){

                int top = stack.peek();
                stack.pop();
                int currentArea = A[top] * (stack.isEmpty()? i : i-stack.peek()-1);

                if(currentArea > maxArea){
                    maxArea = currentArea;
                }
            }
         }
        return maxArea;
    }

    public static void main(String[] args) {
        System.out.println(new LargestRectangleInHistogram().largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3}));
        System.out.println(new LargestRectangleInHistogram().largestRectangleArea(new int[]{3,2,4,1,5,2}));
    }
}
