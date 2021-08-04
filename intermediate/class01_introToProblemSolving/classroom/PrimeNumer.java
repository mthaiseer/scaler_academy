package intermediate.class01_introToProblemSolving.classroom;

import java.time.Duration;
import java.time.Instant;

public class PrimeNumer {

    static boolean  isPrimeBruteForce(int n){
        if(n <= 1){
            return false;
        }
        int count =0;
        for(int i=2; i<n; i++){
            count++;
            if(n%i==0) return false;
        }
        System.out.println("Total brute force run count "+  count++);
        return true;

    }

    static boolean  isPrimeOptimized(int n){
        if(n <= 1){
            return false;
        }
        int count =0;
        for(int i=2; i*i<=n; i++){
            count++;
            if(n%i==0) return false;
        }
        System.out.println("Total optimized run count "+  count++);
        return true;

    }


    public static void main(String[] args) {

        Instant start = Instant.now();
        System.out.println("IS 999983 is prime "+ isPrimeBruteForce(999983));
        Instant finish = Instant.now();
        System.out.println("Time elapsed brute force "+  Duration.between(start, finish).toMillis() +" milliseconds");

        start = Instant.now();
        System.out.println("IS 999983 is prime "+ isPrimeOptimized(999983));
        finish = Instant.now();
        System.out.println("Time elapsed optimized "+  Duration.between(start, finish).toMillis() +" milliseconds");

    }


}
