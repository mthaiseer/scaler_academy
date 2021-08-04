package intermediate.class02_NumberBitManipulation.homework;

public class CountTotalSetBits {

    public int solve(int A) {

        int count = 0;

        int[] bitCounts = new int[A + 1];

        for (int i = 1; i <= A; i++) {

            bitCounts[i] = bitCounts[i >> 1 % 1000000007] + i % 2;

        }

        for (int x : bitCounts) {
            count += x;
        }

        return count % 1000000007;


    }

    // Function which counts set bits from 0 to n
    static int countSetBits(int A) {
        int i = 0;
      int result = 0;
        while ((1 << i) <= A) {

            boolean k = false;
            int change = 1 << i;
            for (int j = 0; j <= A; j++) {

                if (k == true)
                    result += 1;
                else
                    result += 0;

                if (change == 1) {
                    k = !k;
                    change = 1 << i;
                } else {
                    change--;
                }
            }
            i++;
        }

        return result;
    }

    int[] countBits(int n) {

        int[] bitCounts = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            bitCounts[i] = bitCounts[i >> 1] + i % 2;

        }

        return bitCounts;


    }

    public static void main(String[] args) {
        CountTotalSetBits obj = new CountTotalSetBits();
//        int arr[] = obj.countBits(3);
//
//        for(int x : arr){
//            System.out.println(x);
//        }

        System.out.println(obj.countSetBits(5));
    }

}
