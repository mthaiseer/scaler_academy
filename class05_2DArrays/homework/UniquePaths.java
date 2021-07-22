package class05_2DArrays.homework;

public class UniquePaths {

    public int uniquePathsWithCombination(int A, int B) {

        int path = 1;
        for (int i = B; i < (A + B - 1); i++) {
            path *= i;
            path /= (i - B + 1);
        }
        return path;
    }

    public int uniquePaths(int A, int B) {

        if(A == 0 && B ==0){
            return 0;
        }

        int count[][] = new int[A][B];

        for (int i = 0; i < A; i++)
            count[i][0] = 1;
        for (int j = 0; j < B; j++)
            count[0][j] = 1;
        for (int i = 1; i < A; i++) {
            for (int j = 1; j < B; j++)
                count[i][j] = count[i - 1][j] + count[i][j - 1];//+ count[i-1][j-1];
        }
        return count[A - 1][B - 1];

    }

    public int uniquePaths_01(int A, int B) {

        int[] dp = new int[B];
        dp[0] = 1;

        for (int i = 0; i < A; i++) {
            for (int j = 1; j < B; j++) {
                dp[j] += dp[j - 1];
            }
        }

        return dp[B - 1];
    }

    public static void main(String[] args) {
        UniquePaths obj = new UniquePaths();
//        System.out.println(obj.uniquePaths_01(3, 3));
//        System.out.println(obj.uniquePaths_01(2, 2));
//
//        System.out.println(obj.uniquePaths(3, 3));
//        System.out.println(obj.uniquePaths(2, 2));
//        System.out.println(obj.uniquePaths(0, 0));

        System.out.println(obj.uniquePaths(0, 0));
        System.out.println(obj.uniquePaths(2, 2));
    }

}
