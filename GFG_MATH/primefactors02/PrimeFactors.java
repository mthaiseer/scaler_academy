package GFG_MATH.primefactors02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeFactors {


    List<Integer>  findPrimeFactorsBetter(int N, boolean[] primes){

        List<Integer> results  = new ArrayList<>();

        for(int i=2; i*i<=N; i++){

            if(primes[i]){

                while(N%i == 0){
                    results.add(i);
                    N/=i;
                }
           }
        }
        //handle remaining primes
        if(N>1){
            results.add(N);
        }
        return results;

    }


    /**
     * O(LogN + N)
     * @param N
     * @param sieve
     * @return
     */
    List<Integer>  findPrimeFactorsNaive(int N, boolean[] sieve){
        List<Integer> results  = new ArrayList<>();

        for(int i=2; i<=N; i++){
            if(sieve[i]){
                int temp = i;
                while( N % temp == 0){
                    results.add(i);
                    temp*=i;
                }
            }
        }
        return results;
    }




    public static void main(String[] args) {
        PrimeFactors obj = new PrimeFactors();
        boolean[] PRIMES = obj.calculateSeive(1000);
        System.out.println(obj.findPrimeFactorsNaive(12, PRIMES));
        System.out.println(obj.findPrimeFactorsNaive(19, PRIMES));

        System.out.println("************BETTER APPROACH ");
        System.out.println(obj.findPrimeFactorsBetter(12, PRIMES));
        System.out.println(obj.findPrimeFactorsBetter(19, PRIMES));
    }


    boolean[]  calculateSeive(int N){

        boolean[] seive  = new boolean[N+1];
        Arrays.fill(seive, true);
        seive[0] = false;
        seive[1] = false;


        for(int i=2; i*i <=N; i++){

            if(seive[i]){
                for(int j=i*2; j<=N; j+=i){
                    seive[j] = false;
                }
            }
        }
        return seive;
    }
}
