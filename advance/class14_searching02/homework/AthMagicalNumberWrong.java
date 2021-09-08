package advance.class14_searching02.homework;

public class AthMagicalNumberWrong {

    /**
     * Find range MIN(B, C)* A
     * Then find common divisable
     * @param A
     * @param B
     * @param C
     * @return
     */

    public int solve(int A, int B, int C) {

        int M = 1_000_000_007;
        long ans = 0;
        int gcd =  B / gcd(B, C) * C;//lcm(B, C);

        long start =0;
        long end = A * Math.min(B, C);


        while(start<end){

            long mid  =  start  + (end-start) /2;
           // long numOfDivisors = mid /B+ mid/C - mid/gcd;

            if(mid /B+ mid/C - mid/gcd < A){
                ans= mid;
                start = mid+1;


            }else{
                end = mid;
            }
        }
        return (int)ans%M;
    }

    // lcm = (a*b) / gcd(a, b)
    int lcm(int a, int b){

        int gcd = gcd(a, b);
        return b/gcd *a;
    }

    private int gcd(int a, int b) {

        if(a ==0) return b;
        return gcd(b%a , a);
    }

    public static void main(String[] args) {
       // System.out.println(new AthMagicalNumber().solve(7,2,3));
      System.out.println(new AthMagicalNumberWrong().solve(807414236,3788,38141));
        //System.out.println(new AthMagicalNumber().solve(19,11,13));
    }


}
