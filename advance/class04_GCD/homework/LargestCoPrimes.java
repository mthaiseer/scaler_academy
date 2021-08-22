package advance.class04_GCD.homework;

public class LargestCoPrimes {

    public int cpFact(int A, int B) {

        if(A == 1){
            return A;
        }

        while(gcd(A, B) != 1){

            A = A/gcd(A, B);

        }

        return A;

    }

    int gcd(int a, int b){
        if(b  == 0){
            return a;
        }
        return gcd(b , a%b);


    }

    public static void main(String[] args) {
        System.out.println(new LargestCoPrimes().cpFact(30, 12));
        System.out.println(new LargestCoPrimes().cpFact(5, 10));
    }


}
