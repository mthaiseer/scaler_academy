package advance.class08_recursion.classroom;

import java.util.ArrayList;

public class Sixlets {

    public int solve(ArrayList<Integer> A, int B) {


        return solve(A, B, 0, 0, 0);
    }

    int   solve(ArrayList<Integer> A, int B, int sum, int i, int cnt) {


        if( sum > 1000) {
            return 0;
        }

        if(cnt == B) {
            return 1;
        }

        if(i == A.size() ) {
            return 0;
        }

         return   solve(A, B, sum+A.get(i), i+1, cnt+1) + solve(A, B, sum, i+1, cnt);
    }

    public static void main(String[] args) {

        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(8);



        System.out.println(new Sixlets().solve(input, 2));
    }

}
