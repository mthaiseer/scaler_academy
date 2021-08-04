package advance.class02_Arrays.homework;

public class SumOfAllSubMatrix {
    public int solve(int[][] A) {
        int n = A.length;
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                int topLeft = (i + 1) * (j + 1);
                int bottomRight = (n - i) * (n - j);
                sum += (topLeft * bottomRight * A[i][j]);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int A[][] = {
                {1,1},
                {1,1}
        };

        System.out.println(new SumOfAllSubMatrix().solve(A));
    }


}
