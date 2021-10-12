package advance.class19_stacksI.homework;

import java.util.ArrayDeque;
import java.util.Deque;

public class AllSubArrays {

    public int solve(int[] A) {

        int ans = 0;
        Deque<Integer> stack = new ArrayDeque<>();


        for(int i=0; i<A.length; i++){

            while(!stack.isEmpty()){

                ans  = Math.max(ans, (A[i] ^ A[stack.peek()]));
                if(A[i] < A[stack.peek()]){
                    break;
                }
                stack.pop();


            }
            stack.push(i);

        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new AllSubArrays().solve(new int[]{2, 3, 1, 4}));
        System.out.println(new AllSubArrays().solve(new int[]{1,3}));
    }

}
