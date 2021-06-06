package class01_introToProblemSolving.classroom;

import java.time.Duration;
import java.time.Instant;

public class SumOfNNumbers {

    static long sumOOfNNumbersBruteForce(long n){

        long sum = 0;
        for(int i=1; i<=n; i++){
            sum+=i;
        }
       return sum;

    }


    static long sumOOfNNumbersOptimized(long n){
        return (n* (n+1))/2;

    }
    public static void main(String[] args) {

        Instant start = Instant.now();

        System.out.println(sumOOfNNumbersBruteForce(1000000009));

        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        System.out.println("Time elapsed brute force "+ timeElapsed);


        start = Instant.now();

        System.out.println(sumOOfNNumbersOptimized(1000000009));

         finish = Instant.now();
         timeElapsed = Duration.between(start, finish).toMillis();
        System.out.println("Time elapsed optimized : "+ timeElapsed);

    }

}
