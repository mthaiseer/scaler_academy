package advance.class04_GCD.homework;

public class DivisorGame {

    public int solve(int A, int B, int C) {

        int gcd = gcd(B, C);
        int op = (B*C)/gcd;

        return A/op;



    }

    int gcd(int a, int b){

        if(b  == 0){
            return a;
        }

        return gcd(b , a%b);

    }

    public static void main(String[] args) {
        System.out.println(new DivisorGame().solve(12,3,2));
        System.out.println(new DivisorGame().solve(6,1,4));
    }

}
