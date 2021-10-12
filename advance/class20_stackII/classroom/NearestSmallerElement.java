package advance.class20_stackII.classroom;

import java.util.*;

public class NearestSmallerElement {

    public int[] prevSmaller(int[] A) {

        if(A == null){
            return null;
        }

        List<Integer> ans = new ArrayList<>();
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(A[0]);
        ans.add(-1);
        for(int i = 1; i<A.length; i++){

            while(!stack.isEmpty() && stack.peek()>= A[i]){
                stack.pop();
            }


            if(stack.isEmpty()){
                ans.add(-1);
            }else{
                ans.add(stack.peek());
            }
            stack.push(A[i]);
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Arrays.stream(new NearestSmallerElement().prevSmaller(new int[]{4, 5, 2, 10, 8})).forEach(it->{
            System.out.print(it+ " ");
        });
        System.out.println();

        Arrays.stream(new NearestSmallerElement().prevSmaller(new int[]{39, 27, 11, 4, 24, 32, 32, 1})).forEach(it->{
            System.out.print(it+ " ");
        });
    }


}
