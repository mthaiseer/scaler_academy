package advance.class06_combinatronics.practice;

public class NCRUsingDP {


    int ncr(int A , int B, int C){

        int[][] dp = new int[A+1][B+1];
        for(int i=0; i<=A; i++){
            dp[i][0] = 1;
        }

        for(int i=1; i<=A; i++){

            for(int j =1; j<=Math.min(i,B); j++){

                if(i == j){
                    dp[i][j] = 1;
                }else{
                    dp[i][j] = (dp[i-1][j-1]+ dp[i-1][j]) %C;
                }
            }
        }

        return dp[A][B];



    }

    public static void main(String[] args) {
        //System.out.println(new NCRUsingDP().ncr(5, 2, 1000000007));
        System.out.println(new NCRUsingDP().ncr(7269, 4002, 331997));
    }

}
