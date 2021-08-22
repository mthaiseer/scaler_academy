package advance.class07_bitwise.homework;

public class ModSum {

    public int solve(int[] A) {

        int M = 1000000007;
        int[] freq = new int[1001];
        int ans =0;

        for(int x: A){
            freq[x]++;
        }

        for(int i=1; i<=1000; i++){
            for (int j=1; j<=1000; j++){

                int val = i%j;
                int result = freq[i] * freq[j] * val;

                ans = ( ans%M + result %M) %M;
            }
        }
        return ans;


    }

    public static void main(String[] args) {

        System.out.println(new ModSum().solve(new int[]{1, 2, 3}));
        System.out.println(new ModSum().solve(new int[]{17, 100, 11}));

    }


}
