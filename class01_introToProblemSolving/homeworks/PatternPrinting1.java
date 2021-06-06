package class01_introToProblemSolving.homeworks;

import java.util.ArrayList;
import java.util.List;

public class PatternPrinting1 {

    public static int[][] solve(int A) {



        List<List<Integer>> result = new ArrayList<>();
        int arr[][] = new int[A][A];

        for (int i = 1; i <= A; i++) {
            List<Integer> inner = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                inner.add(j);
            }
           result.add(inner);
        }

        int[][] array = new int[result.size()][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[result.get(i).size()];
        }
        for(int i=0; i<result.size(); i++){
            for (int j = 0; j < result.get(i).size(); j++) {
                array[i][j] = result.get(i).get(j);
            }
        }

        return array;
    }

    public static void main(String[] args) {
        solve(4);
    }

}
