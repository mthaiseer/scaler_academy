package GFG_MATH.primenumber01;

import java.util.Arrays;

public class SievePrime {



    boolean[]  calculateSeive(int N){


        boolean[] seive  = new boolean[N+1];
        Arrays.fill(seive, true);
        seive[0] = false;
        seive[1] = false;


        for(int i=2; i*i <=N; i++){

            if(seive[i]){
                for(int j=i*i; j<=N; j+=i){
                    seive[j] = false;
                }
            }
        }
        return seive;
    }

    public static void main(String[] args) {

        SievePrime obj = new SievePrime();
        boolean [] PRIME =  obj.calculateSeive(1000);

        for(int i=0; i<PRIME.length; i++){
            if(PRIME[i]){
                System.out.print( i+  " ");
            }
        }
    }

}
