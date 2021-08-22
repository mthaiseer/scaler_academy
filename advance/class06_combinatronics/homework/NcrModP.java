package advance.class06_combinatronics.homework;

public class NcrModP {

    public int solve(int A, int B, int C) {

        long M = C;
        int nFactorial = factorial(A, C);
        int rInverse = (int)(fastExponentiation(factorial(B, C), C-2, C))%C;
        int rMinusNInvese = (int)(fastExponentiation(factorial((A-B), C), C-2, C))%C;

        long res = ( nFactorial%M * rInverse%M * rMinusNInvese%M ) % M;

        return (int) res;

    }

    /**
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    long  fastExponentiation(long a, long b, long c){

      a%=c;
      long result = 1;

      while(b > 0){

          if((b&1) ==1)
              result = result * a %c;
          a = a*a %c;
          b>>=1;
      }
      return result;


    }

    /**
     *
     * @param n
     * @param m
     * @return
     */
    int  factorial(int n, int m) {
        long ans = 1;

        for (int i = 1; i <= n; i++) {
            ans = ((ans%m) * (i % m) + m)%m;
        }
        return (int)ans % m;
    }




    public static void main(String[] args) {
        System.out.println(new NcrModP().factorial(120, 1000000007));
        System.out.println(new NcrModP().fastExponentiation(5, 3, 1000000007));
        System.out.println(new NcrModP().solve(5,2,13));
        System.out.println(new NcrModP().solve(5,2,7));
        System.out.println(new NcrModP().solve(26,18,367));//323
        System.out.println(new NcrModP().solve(778,578,10007));//3624
        System.out.println(new NcrModP().solve(149,12,48157));//3624

    }


}
