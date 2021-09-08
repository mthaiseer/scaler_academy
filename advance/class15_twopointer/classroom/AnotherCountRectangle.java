package advance.class15_twopointer.classroom;

public class AnotherCountRectangle {

    public int solve(int[] A, int B) {

        int N = A.length;

        long mod = (long)(1000000000 + 7);

        long ans =0;

        int i =0;

        int j = N-1;

        while (i<N && j >=0){

            if((long) A[i] * A[j] < B){

                ans = (ans + j + 1) % mod;

                i++;

            }else {

                j--;

            }

        }

        return (int)ans;
    }

    public static void main(String[] args) {
        System.out.println(new AnotherCountRectangle().solve(new int[]{1,2,4,5}, 5));
        System.out.println(new AnotherCountRectangle().solve(new int[]{1, 2}, 5));
        System.out.println(new AnotherCountRectangle().solve(new int[]{1, 2}, 1));
    }

}
