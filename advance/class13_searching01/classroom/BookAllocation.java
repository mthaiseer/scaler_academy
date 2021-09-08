package advance.class13_searching01.classroom;

import java.util.Arrays;

public class BookAllocation {

    private boolean findMinPossiblePages(int[] books, int students, int N, int mid) {

        int studentCount = 1;
        int windowSum = 0;
        for (int i = 0; i < N; i++) {

            if (windowSum + books[i] > mid) {
                windowSum = books[i];
                studentCount++;

                if (studentCount > students) {
                    return false;
                }
            } else {
                windowSum += books[i];
            }
        }
        return true;
    }

    public int books(int[] A, int B) {



        int N = A.length;

        if(B>N){
            return -1;
        }
        int sumOfPages = 0;
        int ans = Integer.MAX_VALUE;
        int maxPage = Integer.MIN_VALUE;

        for (int pages : A) {
            maxPage = Math.max(maxPage, pages);
            sumOfPages += pages;

        }

        //1 st student will read at least maximum pages,
        //so search space between MAX(A[i])  to SUM(A[i])
        int start = maxPage;
        int end = sumOfPages;

        while (start <= end) {

            int mid = (start + end) / 2;


            boolean maxOfMinPages = findMinPossiblePages(A, B, N, mid);

            if (maxOfMinPages) {
                ans = Math.min(ans, mid);
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }



    public static void main(String[] args) {
        //System.out.println(new BookAllocation().books(new int[]{12, 34, 67, 90}, 2));
        //System.out.println(new BookAllocation().books(new int[]{10,20,30,40}, 2));
        //System.out.println(new BookAllocation().books(new int[]{ 73, 58, 30, 72, 44, 78, 23, 9}, 5));
        //System.out.println(new BookAllocation().books(new int[]{  97, 26, 12, 67, 10, 33, 79, 49, 79, 21, 67, 72, 93, 36, 85, 45, 28, 91, 94, 57, 1, 53, 8, 44, 68, 90, 24}, 26));
        System.out.println(new BookAllocation().books(new int[]{ 31, 14, 19, 75}, 75));
    }
}
