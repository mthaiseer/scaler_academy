package class01_introToProblemSolving.homeworks;

import java.util.ArrayList;
import java.util.List;

public class PatternPrinting1 {

    public static int[][] solve_Extraspace(int A) {



        List<List<Integer>> result = new ArrayList<>();
       // int arr[][] = new int[A][A];

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


    public int[][] solve(int A){

        int [][] ans = new int[A][];
        for(int i=0; i<A; i++){
            ans[i] = new int[i+1];
            for (int j=0; j<i+1; j++){
                ans[i][j] = j+1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        PatternPrinting1 obj = new PatternPrinting1();
        int[][] ans = obj.solve(4);

        for(int i=0; i<ans.length; i++){
            for(int j=0; j<ans[i].length; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

}
