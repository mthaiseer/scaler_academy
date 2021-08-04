package GFG_MATH.modulo;

public class LargeFactorialModulo {

    int fact(long n){

        int M = 1000000007;
        int res = 1;
        for(long i=2; i<=n; i++){
            res  = (int)((res * (i))%M ) %M;

        }

        return res;

    }

    public static void main(String[] args) {
        System.out.println(new LargeFactorialModulo().fact(256655222));
    }

}
