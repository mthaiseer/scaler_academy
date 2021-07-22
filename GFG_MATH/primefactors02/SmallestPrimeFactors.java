package GFG_MATH.primefactors02;

public class SmallestPrimeFactors {

    void findSmallestPrimeFactors(int N){


        int [] seive = new int[N+1];

        //pre-calculate Sieve with smallest primes in its multiples
        for(int i=2; i*i <=N; i++){

            for(int j = i*2; j<=N; j +=i){
                if(seive[j]  ==0){
                    seive[j] = i;
                }

            }

        }

        //Print all number from primes and if ith position is 0 then its a prime
        for(int i=2; i<=N; i++){

            if(seive[i] == 0){
                System.out.print(i + " ");
            }else{
                System.out.print(seive[i] +" ");
            }

        }
    }

    public static void main(String[] args) {
        SmallestPrimeFactors obj = new SmallestPrimeFactors();
       obj.findSmallestPrimeFactors(10);
    }

}
