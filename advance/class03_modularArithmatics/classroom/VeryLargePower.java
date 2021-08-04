package advance.class03_modularArithmatics.classroom;


/**
 *
 *  x ^ Y! % 10^9+7 can be write as  X^K % 10^9+7
 *        Where K = Y! % 10^9+7  (find factorial )
 *        Then do  X^K % 10^9+7 using fast power method
 *
 *
 *
 */
public class VeryLargePower {


    public int solve(int A, int B) {

        int M = 1000000007;
        int fact = factorial(B, M-1);
        int result =  (int)fastPower(A, fact, M) %M;
        return result;

    }

    long  fastPower(int a, int b, int m){

        if(b == 0) return 1;

        long p = fastPower(a, b/2, m);

        p = ( p*p)%m;

        return (b%2 == 0)? p : ((a%m)*p)%m;



    }



    int  factorial(int n, int m) {
        long ans = 1;

        for (int i = 1; i <= n; i++) {
            ans = ((ans%m) * (i % m) + m)%m;
        }
        return (int)ans % m;
    }

    public static void main(String[] args) {


        VeryLargePower obj = new VeryLargePower();
        System.out.println(obj.solve(2,27));


    }



}
