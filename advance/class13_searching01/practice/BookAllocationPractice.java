package advance.class13_searching01.practice;

import java.util.Arrays;

public class BookAllocationPractice {


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


    int allocateBook(int[] books, int students) {

        Arrays.sort(books);
        int N = books.length;
        int sumOfPages = 0;
        int ans = Integer.MAX_VALUE;

        for (int pages : books) {

            sumOfPages += pages;

        }

        int minPages = 0;
        int maxPages = sumOfPages;

        while (minPages <= maxPages) {

            int mid = (minPages + maxPages) / 2;
            System.out.println(mid);

            boolean maxOfMinPages = findMinPossiblePages(books, students, N, mid);

            if (maxOfMinPages) {
                ans = Math.min(ans, mid);
                maxPages = mid - 1;
            } else {
                minPages = mid + 1;
            }


        }

        return ans;

    }

    public static void main(String[] args) {
        System.out.println(new BookAllocationPractice().allocateBook(new int[]{10, 20, 30, 40}, 2));
    }


}
