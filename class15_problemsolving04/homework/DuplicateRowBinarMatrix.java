package class15_problemsolving04.homework;

import class09_strings.homework.AmazingArray;

import java.util.*;

public class DuplicateRowBinarMatrix {

    public int[] solve(int[][] A) {

        int R = A.length;
        int C  = A[0].length;
        Set<String> resSet  = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for(int i=0; i<R; i++){
            StringBuffer buffer = new StringBuffer();
            for(int j =0; j<C; j++){
                buffer.append(A[i][j]);
            }

            String currentData = buffer.toString();
            if(resSet.contains(currentData)){
                result.add(i+1);
            }else{
                resSet.add(buffer.toString());
            }
        }
       return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        DuplicateRowBinarMatrix obj = new DuplicateRowBinarMatrix();
        int R1[] = obj.solve(new int[][]{
                {1,0,0},
                {0,1,0},
                {0,1,0}
        });
        Arrays.stream(R1).forEach(x-> System.out.print(x+ " "));

        System.out.println();
        int R2[] = obj.solve(new int[][]{
                {1, 1, 1, 0},
                {0, 0, 0, 1},
                {1, 1, 1, 0},
                {0, 0, 0, 1}
        });
        Arrays.stream(R2).forEach(x-> System.out.print(x+ " "));

    }


}
