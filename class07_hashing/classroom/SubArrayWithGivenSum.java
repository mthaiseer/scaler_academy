package class07_hashing.classroom;

public class SubArrayWithGivenSum {
    public int[] solve(int[] A, int B) {

        int left = 0;
        int right = 0;
        int sum = 0;


        for (right = 0; right < A.length; right++) {

            sum += A[right];
            while (sum > B) {

                sum -= A[left];
                left++;

            }

            if (sum == B) {

                int size = (right-left)+1;
                int[] result = new int[size];
                int count =0;

                for(int i= left; i<=right; i++){
                    result[count] = A[i];
                    count++;
                }
             return result;
            }


        }
        return new int[]{-1};
    }

    public static void main(String[] args) {

//        int a[] = {42, 9, 38, 36, 48, 33, 36, 50, 38, 8, 13, 37, 33, 38, 17, 25, 50, 50, 41, 29, 34, 18, 16, 6, 49, 16, 21, 29, 41, 7, 37, 14, 5, 30, 35, 26, 38, 35, 9, 36, 34, 39, 9, 4, 41, 40, 3, 50, 27, 17, 14, 5, 31, 42, 5, 39, 38, 38, 47, 24, 41, 5, 50, 9, 29, 14, 19, 27, 6, 23, 17, 1, 22, 38, 35, 6, 35, 41, 34, 21, 30, 45, 48, 45, 37};
//        for(int i=0; i<a.length; i++){
//            System.out.println((i+1) + " "+ a[i]);
//        }
//        //1, 2, 3, 4, 5
       SubArrayWithGivenSum obj = new SubArrayWithGivenSum();
//        int res[] = obj.solve(new int[]{42, 9, 38, 36, 48, 33, 36, 50, 38, 8, 13, 37, 33, 38, 17, 25, 50, 50, 41, 29, 34, 18, 16, 6, 49, 16, 21, 29, 41, 7, 37, 14, 5, 30, 35, 26, 38, 35, 9, 36, 34, 39, 9, 4, 41, 40, 3, 50, 27, 17, 14, 5, 31, 42, 5, 39, 38, 38, 47, 24, 41, 5, 50, 9, 29, 14, 19, 27, 6, 23, 17, 1, 22, 38, 35, 6, 35, 41, 34, 21, 30, 45, 48, 45, 37 }, 100);
//        for (int x : res) {
//            System.out.print(x + " ");
//        }

        System.out.println();
        int res2[] = obj.solve(new int[]{23, 50, 44, 6, 39, 15, 44, 27, 47, 29, 30, 44, 28, 42, 7, 32, 16, 40, 8, 7, 5, 48, 48, 16, 9, 5, 50, 16, 18, 9, 21, 26, 48, 37, 27, 7, 5, 29, 24, 28, 10, 44, 21, 1, 48, 15, 31, 41, 42, 23, 4, 32, 40, 40, 27, 20, 29, 42, 25, 18, 37, 43, 13, 30, 42, 24, 17, 42, 14, 42, 43, 36, 31, 29, 24, 24, 8, 3, 12, 34, 14, 6 }, 62);
        for (int x : res2) {
            System.out.print(x + " ");
        }


    }


}
