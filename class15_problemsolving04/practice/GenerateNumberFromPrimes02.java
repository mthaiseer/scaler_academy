package class15_problemsolving04.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Class : https://www.scaler.com/meetings/i/problem-solving-4-8/archive
 */
public class GenerateNumberFromPrimes02 {

    List<Integer> generateNumberFrom3Primes(int p1, int p2, int p3, int k){

        List<Integer> result = new ArrayList<>();
        int indices[] = new int[3];
        Arrays.fill(indices, 1);
        result.add(1);

        for(int i=0; i<k; i++){

            int p1D = indices[0] * p1;
            int p2D = indices[1]* p2;
            int p3D = indices[2] * p3;

            int min  = Math.min(p1D, Math.max(p2D, p3D));

            if(p1D == min){indices[0]++;}
            if(p2D == min){indices[1]++;}
            if(p3D == min){indices[2]++;}

            result.add(min);

        }



        return result;
    }

    public static void main(String[] args) {
        GenerateNumberFromPrimes02 obj = new GenerateNumberFromPrimes02();
        System.out.println(obj.generateNumberFrom3Primes(2,3,5, 100));
    }

}
