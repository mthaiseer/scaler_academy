package class04_array_dynamicarrays.homework;

import java.util.Arrays;

public class PrimalPower {

     int max = 1000000;
     boolean [] primes = new boolean[max+1];

    public  int solve(int[] A) {

        sieve();
        int count =0;

        for(int i=0; i<A.length; i++){
            if(A[i] > 1 && primes[A[i]]){
                count++;
            }

        }

        return count;
    }

     void sieve(){

        Arrays.fill(primes, true);
        primes[0]= false;
        primes[1] = false;

        for(int i=2; i<=max; i++){

            for (int j=i+i; j<=max; j = j+i){
                primes[j] = false;
            }

        }

    }

    public static void main(String[] args) {

        PrimalPower p = new PrimalPower();

        System.out.println(p.solve(new int[] {-6, 10, 12}));
        System.out.println(p.solve(new int[] {-11, 7, 8, 9, 10, 11}));
    }

}
