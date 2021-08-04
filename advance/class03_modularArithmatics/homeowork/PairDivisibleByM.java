package advance.class03_modularArithmatics.homeowork;

public class PairDivisibleByM {

    public int solve(int[] A, int B) {
        int n  = A.length;
        long count[] = new long[B];
        int MOD = 1000000007;



        for(int i=0; i<n; i++){
            count[A[i]%B]++;

        }
        long ans  = ((count[0]) * ((count[0]-1) %MOD))/2;
        ans%=MOD;



        int i=1; int j = B-1;

        while(i<=j){

            if(i ==  j){
                ans += (count[i] * (count[j]-1))/2;
                ans %=MOD;
            }else{
                ans+= count[i] * count[j];
                ans%=MOD;
            }
            i++;
            j--;

        }
        return (int)ans%MOD;
     }

    public static void main(String[] args) {
        System.out.println(new PairDivisibleByM().solve(new int[]{1,8,4,12,5,10,6}, 6));
        System.out.println(new PairDivisibleByM().solve(new int[]{1,2,3,4,5}, 2));
        System.out.println(new PairDivisibleByM().solve(new int[]{15,17,100,11}, 28));
    }



}
