package class17_problemsolving06.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KthRowPascalTriangle {

    public int[] getRow(int A) {

        List<Integer> resList = new ArrayList<>();
        int prev = 1;
        resList.add(prev);

        for (int i = 1; i <= A; i++) {

            int current = (prev * (A - i + 1)) / i;
            resList.add(current);
            prev = current;
        }
        int [] R = new int[resList.size()];
        int pos =0;
        for(int i=0; i<R.length; i++){
            R[pos++] = resList.get(i);
        }

        return R;
    }

    public static void main(String[] args) {
        KthRowPascalTriangle obj = new KthRowPascalTriangle();
        int[] R = obj.getRow(5);
        Arrays.stream(R).forEach(c-> System.out.print(c + " "));
    }

}
