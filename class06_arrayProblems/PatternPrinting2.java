package class06_arrayProblems;

public class PatternPrinting2 {

    public int[][] solve(int A) {

        int [][] M = new int[A][A];

        for(int i=0; i<A; i++){
            int count =1;
            for(int j=A-1; j>=A-i-1; j--){
                M[i][j] = count++;
            }
        }

        return M;
    }

    public static void main(String[] args) {
        PatternPrinting2 obj = new PatternPrinting2();
        int [][] M = obj.solve(5);

        for(int i=0; i<M.length; i++){
            for(int j=0; j<M.length; j++){
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
    }

}
