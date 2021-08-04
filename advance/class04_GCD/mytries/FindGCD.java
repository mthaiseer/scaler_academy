package advance.class04_GCD.mytries;

public class FindGCD {

    int gcd(int A, int B){
        if(B  == 0) return A;
        return gcd(B, A%B);

    }

    public static void main(String[] args) {
        FindGCD obj = new FindGCD();
        System.out.println(obj.gcd(3, 5));
        System.out.println(obj.gcd(20, 8));
    }
}
