package primer;

import java.util.ArrayList;

public class AreaUnderHills {

    public static String solve(ArrayList<Integer> A) {

        Long sum =0L;
        for(int i : A){
            sum+=i;
        }

        return ""+sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(3);
        data.add(2);
        System.out.println(solve(data));

    }

}
