package class05_2DArrays.homework;

public class SearchRowColSortedMatrix {

    public int solve(int[][] A, int B) {

        int topRow = 0;
        int topCol = A[0].length-1;

        int bottomRow = A.length-1;
        int bottomCol = 0;

        while(topRow <= bottomRow && topCol >=bottomCol){

            if(A[topRow][topCol] == B){
                int minResult = Integer.MAX_VALUE;

                while(topCol >= 0 && A[topRow][topCol] == B){
                    minResult = Math.min ((topRow+ 1) * 1009 + (topCol+1), minResult);
                    topCol--;
                }
               return minResult;
            }

            if(topCol >=0 && topRow <= bottomRow && A[topRow][topCol] <  B){
                topRow++;
            }


            if(topCol >= 0 && topRow <= bottomRow && A[topRow][topCol] >  B){

                topCol--;
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        SearchRowColSortedMatrix obj = new SearchRowColSortedMatrix();
        int solution = obj.solve(new int [][]{
                {2, 8, 8, 8},
                {2, 8, 8, 8},
                {2, 8, 8, 8},
        }, 8);
        System.out.println(solution);


    }


}
