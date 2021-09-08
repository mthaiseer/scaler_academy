package mis;

import java.math.BigInteger;

class SmallestGoodBase {
    public String solve(String A) {
        long number = Long.parseLong(A);
        BigInteger N = BigInteger.valueOf(number);
        int maxExp = (int)(Math.log(number + 1)/Math.log(2));
        for (int exp = maxExp; exp >= 2; exp--) {
            long left = 2;
            long right = (long)(Math.pow(number, 1.0 / (exp - 1)));
            while (left <= right) {
                long mid = left + (right - left) / 2;
                long base = mid;
                BigInteger sum = BigInteger.valueOf(1);
                for (int i = 1; i < exp; i++) {
                    sum = sum.multiply(BigInteger.valueOf(base)).add(BigInteger.ONE);
                }
                if (sum.equals(N)) {
                    return Long.toString(base);
                }
                else if (sum.compareTo(N) == 1) {
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }
        }
        return Long.toString(number - 1);
    }

    public static void main(String[] args) {
        System.out.println(new SmallestGoodBase().solve("13"));
        System.out.println(new SmallestGoodBase().solve("4681"));
    }
}