package GFG_MATH.modulo;

public class FermatsLittleInverse {

    int gcd(int a, int b){
        if(b == 0){
            return a;
        }

        return gcd(b, a%b);
    }

    int fastPower(int a, int p, int m){

        if(p == 0){
            return 1;
        }

        int pow = fastPower(a, p/2, m) %m;

        pow = (pow * pow) %m;

        return (p %2 ==0) ? pow : (a*pow) %m;


    }

    int fermatInverse(int a, int b, int m){

        if(gcd(a,b) != 1){
            throw new RuntimeException("No inverse exists");
        }

        return fastPower(a, b-2, b);

    }

    public static void main(String[] args) {
        int M  = 1000000007;
        FermatsLittleInverse obj = new FermatsLittleInverse();
        System.out.println(obj.fermatInverse(3,11, M));
        System.out.println(obj.fermatInverse(3,5, M));

    }

}
