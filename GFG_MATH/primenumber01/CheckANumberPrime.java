package GFG_MATH.primenumber01;

/**
 *
 * Author: Mohamed Thaiseer
 *
 * Class used to find primality check and different approaches
 *
 */
public class CheckANumberPrime {

    /**
     * O(N) solution
     * @param A
     * @return
     */
    boolean isPrimeNaive(int A){

        if(A == 1 ) return false;

        for(int i=2; i<A; i++){
            if(A % i ==0) return false;
        }

        return true;

    }

    /**
     * O(SQRT(N))
     * @param A
     * @return
     */
    boolean isPrimeBetter(int A){
        if(A == 1) return false;

        for(int i=2; i*i < A; i++){
            if(A % i ==0) return false;
        }

        return true;
    }

    /**
     * O(SQRT(N)) But avoid lot iterations and 3X faster
     * @param A
     * @return
     */
    boolean isPrimeBestApproach(int A){

        if(A == 1) return false;
        if( A == 2 || A  == 3 ) return true;

        if( A  % 2 == 0 || A % 3 == 0 ) return false;

        for(int i=5; i*i <A; i+=6){

            if(A % i == 0 || A% i+2 ==0){
                return false;
            }

        }

        return true;
    }


    public static void main(String[] args) {
        CheckANumberPrime obj = new CheckANumberPrime();

        System.out.println("*************Naive Approach");
        System.out.println(obj.isPrimeNaive(20));
        System.out.println(obj.isPrimeNaive(97));

        System.out.println("*************Better Approach");
        System.out.println(obj.isPrimeBetter(20));
        System.out.println(obj.isPrimeBetter(97));

        System.out.println("*************BEST Approach");
        System.out.println(obj.isPrimeBetter(20));
        System.out.println(obj.isPrimeBetter(997));

    }

}
