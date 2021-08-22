package advance.class03_modularArithmatics.homework;

public class Summation {

    public int solve(int A) {

        int M = 1000000007;

        long exp = fastExpo(3, (A-2), M );

       long result  =  (A  * (A-1) * exp )%M ;

        return (int) result%M;
    }

    long fastExpo(int m, int r, int M ){

        if( r == 0){
            return 1;
        }

        long  sub = fastExpo(m, r/2, M)%M;

        if( (r&1) == 0){
            return ( (sub%M)*(sub%M) %M)%M;
        }

        return (( (m%M) * (sub%M*sub%M))%M)%M;


    }

    public static void main(String[] args) {

        System.out.println(new Summation().solve(5));
        System.out.println(new Summation().solve(3));
        System.out.println(new Summation().solve(39));
    }
}
