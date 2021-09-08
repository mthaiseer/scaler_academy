package advance.class14_searching02.homework;

public class AthMagicalNumber {

    public int nthMagicalNumber(int A, int B, int C) {
        int MOD = 1_000_000_007;
        int L = B / gcd(B, C) * C;

        long start = 0;
        long end = (long) A * Math.min(B, C);
        while (start < end) {
            long mi = start + (end - start) / 2;
            if (mi / B + mi / C - mi / L < A)
                start = mi + 1;
            else
                end = mi;
        }

        return (int) (start % MOD);
    }

    public int gcd(int x, int y) {
        if (x == 0) return y;
        return gcd(y % x, x);
    }

    public static void main(String[] args) {
        System.out.println(new AthMagicalNumber().nthMagicalNumber(807414236,3788,38141));
    }
}
