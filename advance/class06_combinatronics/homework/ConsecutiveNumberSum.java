package advance.class06_combinatronics.homework;

public class ConsecutiveNumberSum {

    public int solve(int A) {

        int result = 0;
        int M = (int) Math.sqrt(A * 2);

        for (int k = 1; k <= M; k++) {

            int T = (A - ((k * (k - 1))/ 2));

            if (T % k == 0) {
                result++;
            }


        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new ConsecutiveNumberSum().solve(5));
        System.out.println(new ConsecutiveNumberSum().solve(15));
    }
}
