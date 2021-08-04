package advance.class02_Arrays.classroom;

public class Flip {

    public int[] flip(String A) {

        int L = 0;
        int maxSum = 0;
        int bestL = 0;
        int bestR = 0;
        int sum = 0;
        boolean isFound = false;


        int arr[] = new int[A.length()];
        int elements[] = new int[A.length()];

        for (int i = 0; i < A.length(); i++) {

            if (A.charAt(i) == '1') {
                arr[i] = -1;
                elements[i] = 1;
            } else {
                arr[i] = 1;
                elements[i] = 0;
            }

        }

        //0111000100010
        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (sum < 0) {
                sum = 0;
                L = Math.max(L + 1, i + 1);
            }


            if (sum > maxSum) {
                isFound = true;
                maxSum = Math.max(sum, maxSum);
                bestL = L;
                bestR = i;

            }


        }


        if (isFound) {

            int res[] = new int[2];
            res[0] = bestL + 1;
            res[1] = bestR + 1;
            return res;


        }

        return new int[]{};


    }


    public static void main(String[] args) {
        //new Flip().flip("1001");
        //new Flip().flip("010");
//        System.out.println(new Flip().flipCount("010"));
//        System.out.println(new Flip().flipCount("1001"));

//        int A[] = new Flip().flip("1101010001");
//        int A2[] = new Flip().flip("111");
        //   int A3[] = new Flip().flip("0111000100010");
        int A3[] = new Flip().flip("1101010001");
//        print(A);
//        print(A2);
        print(A3);
    }

    static void print(int A[]) {
        for (int x : A) {
            System.out.print(" " + x);

        }
        System.out.println();
    }


    /**
     * @param A
     * @return
     */
    public int flipCount(String A) {

        int totalOnesCount = 0;
        int zeroCount = 0;
        int oneCount = 0;
        int ans = 0;

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '1') {
                totalOnesCount++;
            }
        }

        for (int i = 0; i < A.length(); i++) {

            if (A.charAt(i) == '1') {
                oneCount++;
            } else {
                zeroCount++;
            }

            ans = Math.max(ans, (totalOnesCount + zeroCount) - oneCount);

        }


        return ans;


    }


}
